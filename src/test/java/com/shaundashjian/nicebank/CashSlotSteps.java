package com.shaundashjian.nicebank;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import com.shaundashjian.transforms.MoneyConverter;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class CashSlotSteps {
	KnowsTheDomain helper;
	
	public CashSlotSteps(KnowsTheDomain helper) {
		this.helper = helper;
	}
	@Then("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(int dollars) throws Exception {
		assertEquals("Incorrect funds -", dollars, helper.getCashSlot().getContents());
	}
}