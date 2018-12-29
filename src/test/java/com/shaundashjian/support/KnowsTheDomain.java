package com.shaundashjian.support;

import org.javalite.activejdbc.Base;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.shaundashjian.nicebank.Account;
import com.shaundashjian.nicebank.CashSlot;
import com.shaundashjian.nicebank.Teller;

public class KnowsTheDomain {

	private Account account;
	private Teller teller;
	private CashSlot cashSlot;
	private EventFiringWebDriver webDriver;
	
	public KnowsTheDomain() {
		// set the db connection
		if (!Base.hasConnection()) {
			Base.open("com.mysql.jdbc.Driver", 
					"jdbc:mysql://localhost/bank", 
					"teller", "password");
		}
		// if using Firefox
        System.setProperty("webdriver.gecko.driver", "/Users/shaundashjian/Learning/Tools/geckodriver");
        // if using Chrome
        System.setProperty("webdriver.chrome.driver", "/Users/shaundashjian/Learning/Tools/chromedriver");

	}
	public Account getAccount() {
		if (account == null) {
			account = new Account(1234);
			account.saveIt();
		}
		return account;
	}

	public Teller getTeller() {
		if (teller == null) {
			teller = new AtmUserInterface(this);
		}
		return teller;
	}

	public CashSlot getCashSlot() {
		if (cashSlot == null) {
			cashSlot = new CashSlot();
		}
		return cashSlot;
	}

	public EventFiringWebDriver getWebDriver() {
		if (webDriver == null) {
			webDriver = new EventFiringWebDriver(new FirefoxDriver());
		}
		return webDriver;
	}

}
