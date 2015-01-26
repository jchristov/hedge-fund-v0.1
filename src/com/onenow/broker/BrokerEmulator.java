package com.onenow.broker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.onenow.finance.InvType;
import com.onenow.finance.Investment;
import com.onenow.finance.InvestmentOption;
import com.onenow.finance.InvestmentIndex;
import com.onenow.finance.InvestmentStock;
import com.onenow.finance.MarketAnalytics;
import com.onenow.finance.MarketPrice;
import com.onenow.finance.Portfolio;
import com.onenow.finance.Trade;
import com.onenow.finance.TradeType;
import com.onenow.finance.Transaction;
import com.onenow.finance.Underlying;

public class BrokerEmulator implements Broker {

	private static List<Underlying> underList;
	private static Portfolio marketPortfolio;
	private static List<Trade> trades;
	private static Portfolio myPortfolio; 
	private static MarketPrice marketPrices;
	private static MarketAnalytics marketAnalytics;
		
	
	public BrokerEmulator() {
		setUnderList(new ArrayList<Underlying>());
		setMarketPortfolio(new Portfolio());
		
		setMyPortfolio(new Portfolio());
		setMarketPrices(new MarketPrice());
		setTrades(new ArrayList<Trade>());
		
		initMarket("aapl");
		initExocet("spx");
	}
	
	@Override
	public List<Underlying> getUnderlying() {
		return getUnderList();
	}
	
	@Override
	public void enterTransaction(Transaction trans) {
		getTrades().addAll(trans.getTrades());
		getMyPortfolio().enterTransaction(trans);		
	}

	@Override
	public Portfolio getMyPortfolio() {
		return myPortfolio;
	}
	
	@Override
	public List<Trade> getTrades() {
		return trades;	
	}

	@Override
	public Double getPrice(Investment inv, TradeType type) {
		Double price=getMarketPrices().getPrice(inv, type);
		return price;
	}

	private static void initMarket(String name) {
		Underlying under = new Underlying(name);
		// create the investments
		Date expDate = new Date(1000000);
		Investment stock = new InvestmentStock(under);
		Investment call1 = new InvestmentOption(under, InvType.call, expDate, 405.00);
		Investment call2 = new InvestmentOption(under, InvType.call, expDate, 400.00);
		Investment put1 = new InvestmentOption(under, InvType.put, expDate, 390.00);
		Investment put2 = new InvestmentOption(under, InvType.put, expDate, 385.00);		
		// set their prices
		getMarketPrices().setPrice(stock, 396.00, 395.00);
		getMarketPrices().setPrice(call1, 7.41, 7.40);
		getMarketPrices().setPrice(call2, 8.85, 8.84);
		getMarketPrices().setPrice(put1, 9.50, 9.49);
		getMarketPrices().setPrice(put2, 8.33, 8.32);
		// create trades based on market price
		Trade stockTrade = new Trade(stock, TradeType.BUY, 75, getMarketPrices().getPrice(stock, TradeType.BUY));
		Trade stockCall1 = new Trade(call1, TradeType.BUY, 75, getMarketPrices().getPrice(call1, TradeType.BUY));
		Trade stockCall2 = new Trade(call2, TradeType.BUY, 75, getMarketPrices().getPrice(call2, TradeType.BUY));
		Trade stockPut1 = new Trade(put1, TradeType.BUY, 75, getMarketPrices().getPrice(put1, TradeType.BUY));
		Trade stockPut2 = new Trade(put2, TradeType.BUY, 75, getMarketPrices().getPrice(put2, TradeType.BUY));
		// transact it
		Transaction trans = new Transaction(stockTrade, stockCall1, stockCall2, stockPut1, stockPut2);
		marketPortfolio.enterTransaction(trans);
	}
	private static void initExocet(String name) {
		Underlying under = new Underlying(name);
		// create the investments
		Date expDate = new Date(1000000);
		Investment index = new InvestmentIndex(under);
		Investment call1 = new InvestmentOption(under, InvType.call, expDate, 2060.00);
		Investment call2 = new InvestmentOption(under, InvType.call, expDate, 2055.00);
		Investment put1 = new InvestmentOption(under, InvType.put, expDate, 2050.00);
		Investment put2 = new InvestmentOption(under, InvType.put, expDate, 2045.00);		
		// set their prices
		getMarketPrices().setPrice(index, 2051.82);
		getMarketPrices().setPrice(call1, 0.05, 0.35);
		getMarketPrices().setPrice(call2, 0.50, 1.65);
		getMarketPrices().setPrice(put1, 1.10, 1.70);
		getMarketPrices().setPrice(put2, 0.15, 0.20);
		// create trades based on market price
		Trade stockTrade = new Trade(index, TradeType.BUY, 75, getMarketPrices().getPrice(index, TradeType.LAST));
		Trade stockCall1 = new Trade(call1, TradeType.BUY, 75, getMarketPrices().getPrice(call1, TradeType.BUY));
		Trade stockCall2 = new Trade(call2, TradeType.BUY, 75, getMarketPrices().getPrice(call2, TradeType.BUY));
		Trade stockPut1 = new Trade(put1, TradeType.BUY, 75, getMarketPrices().getPrice(put1, TradeType.BUY));
		Trade stockPut2 = new Trade(put2, TradeType.BUY, 75, getMarketPrices().getPrice(put2, TradeType.BUY));
		// transact it
		Transaction trans = new Transaction(stockTrade, stockCall1, stockCall2, stockPut1, stockPut2);
		marketPortfolio.enterTransaction(trans);		
	}
	
	
	// PRINT
	public String toString() {
		String s = "";
		s = s + "UNDERLYING: " + "\n" + getUnderList().toString() + "\n";		
		s = s + "MARKET PORTFOLIO: " + "\n" + getMarketPortfolio().toString() + "\n";
		s = s + "PRICES" + "\n" + marketPrices.toString() + "\n";
		s = s + "TRADES: " + "\n";
		for(Trade trade:getTrades()) {
			s = s + trade.toString() + "\n";
		}		
		s = s + "MY PORTFOLIO" + "\n" + getMyPortfolio() + "\n";
		return s;
	}
	
	// TEST
	
	


	// SET GET
	private static List<Underlying> getUnderList() {
		return underList;
	}

	private static void setUnderList(List<Underlying> underList) {
		BrokerEmulator.underList = underList;
	}

	private static void setMyPortfolio(Portfolio myPortfolio) {
		BrokerEmulator.myPortfolio = myPortfolio;
	}

	private static MarketPrice getMarketPrices() {
		return marketPrices;
	}

	private static void setMarketPrices(MarketPrice marketPrices) {
		BrokerEmulator.marketPrices = marketPrices;
	}

	private static void setTrades(List<Trade> trades) {
		BrokerEmulator.trades = trades;
	}

	private static MarketAnalytics getMarketAnalytics() {
		return marketAnalytics;
	}

	private static void setMarketAnalytics(MarketAnalytics marketAnalytics) {
		BrokerEmulator.marketAnalytics = marketAnalytics;
	}

	public Portfolio getMarketPortfolio() {
		return BrokerEmulator.marketPortfolio;
	}

	private static void setMarketPortfolio(Portfolio marketPortfolio) {
		BrokerEmulator.marketPortfolio = marketPortfolio;
	}

}
