package com.shaundashjian.nicebank;

import static org.junit.Assert.assertEquals;

import com.shaundashjian.support.KnowsTheDomain;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class CashSlotSteps {
	KnowsTheDomain helper;
	
	public CashSlotSteps(KnowsTheDomain helper) {
		this.helper = helper;
	}
	@Then("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(int dollars) throws Exception {
		int timeout = 3000;
		int pollInterval = 1000;
		while (helper.getCashSlot().getContents() != dollars 
				&& timeout > 0) {
			Thread.sleep(pollInterval);
			timeout -= pollInterval;
		}
		assertEquals("Incorrect funds -", dollars, helper.getCashSlot().getContents());
	}
	
	@Then("^nothing should be dispensed$")
	public void nothingShouldBeDispensed() throws Exception {
		assertEquals("Incorrect funds -", 0, helper.getCashSlot().getContents());
	}
}