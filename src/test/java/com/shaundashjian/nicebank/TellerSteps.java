package com.shaundashjian.nicebank;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import com.shaundashjian.transforms.MoneyConverter;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class TellerSteps {

	KnowsTheDomain helper;
	
	public TellerSteps(KnowsTheDomain helper) {
		this.helper = helper;
	}
	
	@When("^I withdraw \\$(\\d+)$")
	public void iWithdraw$(int dollars) throws Exception {
		helper.getTeller().withdrawFrom(helper.getAccount(), dollars);
	}

}