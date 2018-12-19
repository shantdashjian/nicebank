package com.shaundashjian.hooks;

import javax.sound.sampled.Port;

import com.shaundashjian.nicebank.AtmServer;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServerHooks {
	
	public static final int PORT = 8887;
	private AtmServer server;
	
	@Before(order = 10)
	public void startServer() throws Exception {
		server = new AtmServer(PORT);
		server.start();
	}
	
	@After(order = 10)
	public void stopServer() throws Exception {
		server.stop();
	}
}
