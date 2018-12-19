package com.shaundashjian.nicebank;

import static org.junit.Assert.assertEquals;

import com.shaundashjian.support.KnowsTheDomain;
import com.shaundashjian.transforms.MoneyConverter;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AccountSteps {
	KnowsTheDomain helper;
	
	public AccountSteps(KnowsTheDomain helper) {
		this.helper = helper;
	}
	
	@Given("^my account has been credited with (\\$\\d+\\.\\d+)$")
	public void myAccountHasBeenCreditedWith$(
			@Transform(MoneyConverter.class) Money amount) throws Exception {
		helper.getAccount().credit(amount);
	}
	
	@Then("^the balance of my account should be (\\$\\d+\\.\\d+)$")
	public void theBalanceOfMyAccountShouldBe$(
			@Transform(MoneyConverter.class) Money amount) throws Exception {
	    assertEquals("Incorrect funds -", amount, helper.getAccount().getBalance());
	}

}