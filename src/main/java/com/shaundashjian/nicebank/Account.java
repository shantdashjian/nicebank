package com.shaundashjian.nicebank;

import org.javalite.activejdbc.Model;

public class Account extends Model {
	static final String INSUFFICIENT_FUNDS = "You have insufficient funds in your account!";
	static final String BALANCE_MESSAGE = "Your balance is: $";
	private String display = "";
	private static final int SLEEP = 0;
	
	private TransactionQueue queue = new TransactionQueue();

	public Account() {
		
	}
	public Account(int number) {
		setInteger("number", number);
		setString("balance", "0.00");
	}
	
	public void credit(Money amount) {
		queue.write("+" + amount.toString() + "," + getNumber());
	}

	public int debit(int dollars) {
//		if (getBalance().dollars() >= dollars) {
			Money amount = new Money(dollars, 0);
			queue.write("-" + amount.toString() + "," + getNumber());
			display = "";
			return dollars;
//		}
//		display = Account.INSUFFICIENT_FUNDS;
//		return 0;
	}

	public int getNumber() {
		return getInteger("number");
	}
	
	public Money getBalance() {
		refresh();
		display = Account.BALANCE_MESSAGE + getString("balance").toString();
		return new Money(getString("balance"));
	}

	public void setBalance(Money amount) {
		setString("balance", amount.toString());
		saveIt();
	}
	
	public String getDisplay() {
		return display;
	}

}
