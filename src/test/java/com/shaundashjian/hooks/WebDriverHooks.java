package com.shaundashjian.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

import com.shaundashjian.support.KnowsTheDomain;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class WebDriverHooks {
	private KnowsTheDomain helper;
	
	public WebDriverHooks(KnowsTheDomain helper) {
		this.helper = helper;
	}
	
	@After
	public void finish(Scenario scenario) {
		try {
			byte[] screenshot = 
					helper.getWebDriver().getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		} catch (WebDriverException somePlatformsDontSupportScreenshots) {
			System.err.println(somePlatformsDontSupportScreenshots.getMessage());
		} finally {
			helper.getWebDriver().close();
		}
	}
}