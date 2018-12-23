package com.shaundashjian.nicebank;

import static org.junit.Assert.assertEquals;

import com.shaundashjian.support.KnowsTheDomain;
import com.shaundashjian.transforms.MoneyConverter;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.Timeout;

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
		
		int timeout = 3000;
		int pollInterval = 1000;

		while (!helper.getAccount().getBalance().equals(amount)
				&& timeout > 0) {
			Thread.sleep(pollInterval);
			timeout -= pollInterval;
		}
		
	    assertEquals("Incorrect funds -", amount, helper.getAccount().getBalance());
	}
	
	@When("^I check my balance$")
	public void iCheckMyBalance() throws Exception {
	    helper.getTeller().checkBalance(helper.getAccount());
	}
	
	@Then("^I should be told that I have insufficient funds in my account$")
	public void iShouldBeToldThatIHaveInsufficientFundsInMyAccount() throws Exception {
	    assertEquals(Account.INSUFFICIENT_FUNDS, helper.getAccount().getDisplay());
	}
	
	@Then("^I should see that my balance is \\$(\\d+)\\.(\\d+)$")
	public void iShouldSeeThatMyBalanceIs$(int arg1, int arg2) throws Exception {
	    assertEquals(Account.BALANCE_MESSAGE + helper.getAccount().getBalance(), 
	    		helper.getAccount().getDisplay());
	}


}