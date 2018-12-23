package com.shaundashjian.hooks;

import com.shaundashjian.nicebank.TransactionProcessor;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BackgroundProcessHooks {
	private Thread transactionProcessThread;
	
	@Before
	public void startBackgroundThread() {
		transactionProcessThread = new Thread() {
			public void run() {
				TransactionProcessor processor = new TransactionProcessor();
				processor.process();
			}
		};
		transactionProcessThread.start();
	}
	
	@After
	public void stopBackgroundThread() {
		transactionProcessThread.interrupt();
	}
}