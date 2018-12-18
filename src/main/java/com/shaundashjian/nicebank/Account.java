package com.shaundashjian.nicebank;

public class Account {

	private Money balance;
	
	public Account() {
		balance = new Money();
	}
	
	public void deposit(Money amount) {
		balance = balance.add(amount);
	}

	public int withdraw(int dollars) {
		if (balance.dollars() >= dollars) {
			balance = balance.minus(new Money(dollars, 0));
			return dollars;
		}
		return 0;
	}

	public Money getBalance() {
		return balance;
	}

}
