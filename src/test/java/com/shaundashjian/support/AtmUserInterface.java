package com.shaundashjian.support;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.shaundashjian.nicebank.Account;
import com.shaundashjian.hooks.ServerHooks;
import com.shaundashjian.nicebank.Teller;

public class AtmUserInterface implements Teller {

	private final EventFiringWebDriver webDriver;
	
	public AtmUserInterface() {
        System.setProperty("webdriver.gecko.driver", "/Users/shaundashjian/Learning/Tools/geckodriver");

		this.webDriver = new EventFiringWebDriver(new FirefoxDriver());
	}
	@Override
	public void withdrawFrom(Account account, int dollars) {
		try {
			webDriver.get("http://localhost:" + ServerHooks.PORT);
			webDriver.findElement(By.id("Amount"))
				.sendKeys(String.valueOf(dollars));
			webDriver.findElement(By.id("Withdraw")).click();
		} finally {
			webDriver.close();
		}
	}

}
