package com.shaundashjian.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.shaundashjian.nicebank.Account;
import com.shaundashjian.hooks.ServerHooks;
import com.shaundashjian.nicebank.Teller;

public class AtmUserInterface implements Teller {

	private KnowsTheDomain helper;
	private EventFiringWebDriver webDriver;
	
	public AtmUserInterface(KnowsTheDomain helper) {
		this.helper = helper;
		this.webDriver = helper.getWebDriver();
	}
	@Override
	public void withdrawFrom(Account account, int dollars) {
			webDriver.get("http://localhost:" + ServerHooks.PORT);
			webDriver.findElement(By.id("withdraw" + dollars)).click();
	}
//	@Override
//	public void withdrawFrom(Account account, int dollars) {
//		webDriver.get("http://localhost:" + ServerHooks.PORT);
//		webDriver.findElement(By.id("amount"))
//		.sendKeys(String.valueOf(dollars));
//		webDriver.findElement(By.id("withdraw")).click();
//	}
	@Override
	public void checkBalance(Account account) {
		webDriver.get("http://localhost:" + ServerHooks.PORT);
		webDriver.findElement(By.id("checkBalance")).click();		
	}

}
