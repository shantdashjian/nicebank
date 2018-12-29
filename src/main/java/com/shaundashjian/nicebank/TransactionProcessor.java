package com.shaundashjian.nicebank;

import org.javalite.activejdbc.Base;

public class TransactionProcessor {
	private TransactionQueue queue = new TransactionQueue();
	private static final int SLEEP = 1000;

	public void process() {
		// set the db connection
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/bank", "teller", "password");
		
		do {
			String message = queue.read();
			System.out.println("************** processing: " + message);
			try {
				Thread.sleep(SLEEP);
			} catch (InterruptedException e) {

			}

			if (message.length() > 0) {
				String[] parts = message.split(",");
				Account account = Account.findFirst("number = ?", parts[1]);
				Money transactionAmount = new Money(parts[0]);

				if (isCreditTransaction(message)) {
					account.setBalance(account.getBalance().add(transactionAmount));
				} else {
					account.setBalance(account.getBalance().minus(transactionAmount));
				}
			}

		} while (true);
	}

	private boolean isCreditTransaction(String message) {
		return message.startsWith("+");
	}
}