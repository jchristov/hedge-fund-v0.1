package com.onenow.instrument;

import com.onenow.constant.InvType;

public class InvestmentStock extends Investment {

	// CONSTRUCTOR
	public InvestmentStock() {
		
	}
	
	public InvestmentStock (Underlying underlying) {
		super(underlying, InvType.STOCK);
	}
	
	// PUBLIC
	public Double getValue(Double marketPrice) { // TODO: set real value (i.e. vs strike)
		Double val=0.0;
		return val;
	}
	
	// PRINT
	public String toString() {
		String s = "";
		s = super.toString();
		return s;
	}
	
}
