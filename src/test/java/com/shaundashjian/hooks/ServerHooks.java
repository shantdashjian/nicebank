package com.shaundashjian.hooks;

import javax.sound.sampled.Port;

import com.shaundashjian.nicebank.AtmServer;
import com.shaundashjian.support.KnowsTheDomain;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServerHooks {
	KnowsTheDomain helper;
	public static final int PORT = 8887;
	private AtmServer server;
	
	public ServerHooks(KnowsTheDomain helper) {
		this.helper = helper;
	}
	@Before(order = 10)
	public void startServer() throws Exception {
		server = new AtmServer(PORT, helper.getCashSlot(), helper.getAccount());
		server.start();
	}
	
	@After(order = 10)
	public void stopServer() throws Exception {
		server.stop();
	}
}
