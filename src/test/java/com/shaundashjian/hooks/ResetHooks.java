package com.shaundashjian.hooks;

import org.javalite.activejdbc.Base;

import com.shaundashjian.nicebank.TransactionQueue;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ResetHooks {
	@Before
	public void reset() {
		TransactionQueue.clear();
	}
}