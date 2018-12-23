package com.shaundashjian.hooks;

import com.shaundashjian.nicebank.BalanceStore;
import com.shaundashjian.nicebank.TransactionQueue;

import cucumber.api.java.Before;

public class ResetHooks {
	@Before
	public void reset() {
		TransactionQueue.clear();
		BalanceStore.clear();
	}
}