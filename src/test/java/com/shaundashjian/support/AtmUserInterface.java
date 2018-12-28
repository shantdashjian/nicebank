package com.shaundashjian.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.shaundashjian.nicebank.Account;
import com.shaundashjian.hooks.ServerHooks;
import com.shaundashjian.nicebank.Teller;

public class AtmUserInterface implements Teller {

	private KnowsTheDomain helper;
	private EventFiringWebDriver webDriver;
	public static final long SLEEP = 2000;

	
	public AtmUserInterface(KnowsTheDomain helper) {
		this.helper = helper;
		this.webDriver = helper.getWebDriver();
	}
	@Override
	public void withdrawFrom(Account account, int dollars) {
		try {
			
			webDriver.get("http://localhost:" + ServerHooks.PORT);
			Thread.sleep(AtmUserInterface.SLEEP);
			Actions actions = new Actions(webDriver);
			WebElement element = webDriver.findElement(By.id("withdraw" + dollars));
			actions.moveToElement(element).click().perform();
			
			Thread.sleep(AtmUserInterface.SLEEP);
		} catch (Exception e) {
			// TODO: handle exception
		}
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
		try {
			
		webDriver.get("http://localhost:" + ServerHooks.PORT);
		Thread.sleep(AtmUserInterface.SLEEP);
		webDriver.findElement(By.id("checkBalance")).click();
		Thread.sleep(AtmUserInterface.SLEEP);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
