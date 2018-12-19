package com.shaundashjian.nicebank;

import com.shaundashjian.support.KnowsTheDomain;

import cucumber.api.java.en.When;

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