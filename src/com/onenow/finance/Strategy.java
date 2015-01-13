package com.onenow.finance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Strategy {
	
	private Transaction transaction;
	private List<Double> checkpoints;	
	private Reward reward;
	
	// CONSTRUCTOR
	public Strategy() {
		setTransaction(new Transaction());
		setCheckpoints(new ArrayList<Double>());
	}
	
	// PUBLIC	
	public Double getMargin() {
		return(getTransaction().getMargin());
	}
	
	public Double getNetMargin() {
		return(getMargin() - getNetPremium());
	}
	
	public Double getNetValue(Double marketPrice) {
		Double net = getNetPremium();
		for(Trade trade:getTransaction().getTrades()) {
			net += trade.getValue(marketPrice); 
		}
		return net;
	}
	
	public Double getNetPremium() {
		Double netPremium = 0.0;
		for (Trade trade:getTransaction().getTrades()) {
			netPremium += trade.getNetPremium();
		}
		return  netPremium;
	}
	
	public boolean isCreditStrategy() {
		if(getNetPremium()>0.0) { 
			return true;
		}
		return false;
	}
	
	public boolean isDebitStrategy() {
		return (!isCreditStrategy());
	}

	
	public Double getMaxProfit() { // profit
		Double max=0.0;
		setStrikes();
		for(Double price:getCheckpoints()) {
			Double net=getNetValue(price);
			if(net>max) {
				max=net;
			}
		}
		return max;
	}

	public Double getMaxLoss() { // loss
		Double max=0.0;
		setStrikes();
		for(Double price:getCheckpoints()) {
			Double net=getNetValue(price);
			if(net<max) {
				max=net;
			}
		}		
		return max;
	}
	
	private Double getMaxROI() {
		return (Math.abs(getMaxProfit()/getMaxLoss())*100);
	}
	
	private Double getRiskReward() {
		return((1/(getMaxROI()/100))*100);
	}

	// Use bidding algorithm to determine order of execution of this strategy
	public Double getBiddingOrder(Enum rewardAlgo) {
		Double order=0.0;
		setBiddingOrder();
		order = getReward().getAlgoOrder(rewardAlgo);
		return order;
	}
	

	// PRIVATE
	private void setBiddingOrder(){
		setReward(new Reward(getTransaction().probabilityOfProfit(), getMaxROI()));
	}

	private void setStrikes() {
		Double strike=0.0;
		for (Trade trade:getTransaction().getTrades()) {
			strike = trade.getStrike();
			setStrikeVariants(strike);
		}
	}

	private void setStrikeVariants(Double strike) { // explore Net around strikes
		Double buffer=0.025;
		addNewCheckpoint(strike);
		addNewCheckpoint(strike*(1+buffer));
		addNewCheckpoint(strike*(1-buffer));
	}
	
	private void addNewCheckpoint(Double num) {
		if(!getCheckpoints().contains(num)){
			getCheckpoints().add(num);
		}
	}

	
	// PRINT
	public String toString(){
		String s = "";
		s = s + getTransaction().toString();
		s = s + "Max Profit: $" + getMaxProfit() + ". " + 
				"Max Loss: $" + getMaxLoss() + "\n";
		s = s + "Margin Required: $" + getMargin().intValue() + ". " + 
				"Buying Power (net margin after credit): $" + getNetMargin().intValue() + "\n";
		s = s + "Maximum Profit: " + getMaxROI().intValue() + "%" + ". " + 
				"Risk/Reward: " + getRiskReward().intValue() + "%" + "\n";
		s = s + checkpointValueToString();
		s = s + bidOrderToString();
		return(s);
	}

	private String checkpointValueToString() {
		String s = "";
		setStrikes();
		Collections.sort(getCheckpoints());
		for(int i=0; i<getCheckpoints().size(); i++) {
			Double checkpoint = getCheckpoints().get(i);
			s = s + "Profit($" + checkpoint.intValue() + "): $" + getNetValue(checkpoint).intValue() + "\n";
		}
		return s;
	}
	
	private String bidOrderToString() {
		String s = ""; // intValue
		s = s + "BIDDING SCORE ";
		s = s + RewardAlgo.Linear + ": " + getBiddingOrder(RewardAlgo.Linear).intValue() + ". " +
				RewardAlgo.Success + ": " + getBiddingOrder(RewardAlgo.Success).intValue() + ". " +
				RewardAlgo.ROI + ": " + getBiddingOrder(RewardAlgo.ROI).intValue() + "\n";
		return s;
	}
	
	// TEST 
	public void testMaxProfit(Double num) {
		if(!getMaxProfit().equals(num)) {
			System.out.println("ERROR: (t0) max profit $" + getMaxProfit());
		}
	}
	public void testMaxLoss(Double num) {
		if(!getMaxLoss().equals(num)) {
			System.out.println("ERROR: (te) max loss $" + getMaxLoss());
		}
	}	
	public void testNetValue(Double price, Double value) {
		if(!getNetValue(price).equals(value)) {
			System.out.println("ERROR net $" + getNetValue(375.0));					
		}		
	}
	public void testMargin(Double num) {
		if(!getMargin().equals(num)) {
			System.out.println("ERROR: margin $" + getMargin());
		}
	}
	public void testNetMargin(Double num) {
		if(!getNetMargin().equals(num)) {
			System.out.println("ERROR: net margin $" + getNetMargin());
		}
	}
	public void testMaxROI(Double num) {
		if(!getMaxROI().equals(num)) {
			System.out.println("ERROR: max ROI %" + getMaxROI());
		}
	}
	public void testRiskReward(Double num) {
		if(!getRiskReward().equals(num)) {
			System.out.println("ERROR: (te) max loss $" + getRiskReward());
		}	
	}
	public void testBiddingOrder(Double num, Enum rewardAlgo) {
//		if(!getBiddingOrder(Enum rewardAlgo).equals(num)) {
//			System.out.println("ERROR: (te) max loss $" + getBiddingOrder(rewardAlgo));
//		}		
	}


	// SET GET
	public Transaction getTransaction() {
		return transaction;
	}

	private void setTransaction(Transaction transaction) {
		this.transaction = transaction;
		}

	private List<Double> getCheckpoints() {
		return checkpoints;
	}

	private void setCheckpoints(List<Double> checkpoints) {
		this.checkpoints = checkpoints;
	}

	private Reward getReward() {
		return reward;
	}

	private void setReward(Reward reward) {
		this.reward = reward;
	}

}
