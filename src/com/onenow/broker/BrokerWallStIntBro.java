package com.onenow.broker;

import java.util.Date;
import java.util.List;

import com.onenow.finance.Investment;
import com.onenow.finance.Trade;
import com.onenow.finance.Transaction;
import com.onenow.finance.Underlying;

public class BrokerWallStIntBro implements BrokerWallSt {

	public BrokerWallStIntBro() {
		// TODO
	}

	@Override
	public List<Underlying> getUnderlying() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Investment> getInvestments(boolean myPortfolio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getPriceAsk(Investment inv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getPriceBid(Investment inv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Investment getBest(Underlying under, Enum invType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Investment getBest(Underlying under, Enum invType, Date expiration,
			Double strike) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trade> getTrades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTrade(Transaction transaction) {
		// TODO Auto-generated method stub
		
	}

}