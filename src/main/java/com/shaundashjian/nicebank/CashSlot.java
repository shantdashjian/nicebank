package com.shaundashjian.nicebank;

public class CashSlot {
	private int contents;
	
	public void despense(int dollars) {
		contents = dollars;
	}

	public int getContents() {
		return contents;
	}

}
