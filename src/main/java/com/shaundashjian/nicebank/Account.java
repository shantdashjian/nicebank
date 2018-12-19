package com.shaundashjian.nicebank;

public class Account {
	static final String INSUFFICIENT_FUNDS = "You have insufficient funds in your account!";
	static final String BALANCE_MESSAGE = "Your balance is: $";
	private String display = "";
	
	private Money balance;

	public Account() {
		balance = new Money();
	}
	
	public void credit(Money amount) {
		balance = balance.add(amount);
	}

	public int debit(int dollars) {
		if (balance.dollars() >= dollars) {
			balance = balance.minus(new Money(dollars, 0));
			display = "";
			return dollars;
		}
		display = Account.INSUFFICIENT_FUNDS;
		return 0;
	}

	public Money getBalance() {
		display = Account.BALANCE_MESSAGE + balance;
		return balance;
	}

	public String getDisplay() {
		return display;
	}

}
