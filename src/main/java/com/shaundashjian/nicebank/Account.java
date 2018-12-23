package com.shaundashjian.nicebank;

public class Account {
	static final String INSUFFICIENT_FUNDS = "You have insufficient funds in your account!";
	static final String BALANCE_MESSAGE = "Your balance is: $";
	private String display = "";
	private static final int SLEEP = 0;
	
	private TransactionQueue queue = new TransactionQueue();

	public Account() {
	}
	
	public void credit(Money amount) {
		try {
			Thread.sleep(SLEEP);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		queue.write("+" + amount.toString());
	}

	public int debit(int dollars) {
		if (BalanceStore.getBalance().dollars() >= dollars) {
			Money amount = new Money(dollars, 0);
			queue.write("-" + amount.toString());
			display = "";
			return dollars;
		}
		display = Account.INSUFFICIENT_FUNDS;
		return 0;
	}

	public Money getBalance() {
		display = Account.BALANCE_MESSAGE + BalanceStore.getBalance();
		return BalanceStore.getBalance();
	}

	public String getDisplay() {
		return display;
	}

}
