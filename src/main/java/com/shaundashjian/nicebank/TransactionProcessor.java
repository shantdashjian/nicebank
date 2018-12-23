package com.shaundashjian.nicebank;

import com.shaundashjian.support.AtmUserInterface;

public class TransactionProcessor {
	private TransactionQueue queue = new TransactionQueue();
	private static final int SLEEP = 1000;
	
	public void process() {
		do {
			String message = queue.read();
			
			try {
				Thread.sleep(SLEEP);
			} catch (InterruptedException e) {
			
			}
			
			if (message.length() > 0) {
				Money balance = BalanceStore.getBalance();
				Money transactionAmount = new Money(message);
				
				if (isCreditTransaction(message)) {
					BalanceStore.setBalance(balance.add(transactionAmount));
				} else {
					BalanceStore.setBalance(balance.minus(transactionAmount));
				}
			}
			
		} while (true);
	}

	private boolean isCreditTransaction(String message) {
		return message.startsWith("+");
	}
}