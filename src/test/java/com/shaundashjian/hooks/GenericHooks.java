package com.shaundashjian.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GenericHooks {
	@Before(order = 1) 
	public void beforeScenario(Scenario scenario) {
		System.out.println("*********** About to start scenario: " + scenario.getName());
	}
	
	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		System.out.println("************ Finished scenario with status: " + scenario.getStatus());
	}
}