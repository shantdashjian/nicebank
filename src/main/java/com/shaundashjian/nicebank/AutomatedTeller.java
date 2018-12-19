package com.shaundashjian.nicebank;

public class AutomatedTeller implements Teller{
	private CashSlot cashSlot;
	private String error;
	
	public AutomatedTeller(CashSlot cashSlot) {
		this.cashSlot = cashSlot;
	}
	public void withdrawFrom(Account account, int dollars) {
		int amountDispensed = account.debit(dollars);
		cashSlot.despense(amountDispensed);
	}
	
	@Override
	public void checkBalance(Account account) {
		account.getBalance();
		
	}
	

}
