package com.shaundashjian;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:out"}, 
				snippets = SnippetType.CAMELCASE, 
				strict = true,
				dryRun = false
				, tags = {"@dev"}
				)
public class RunCucumberTest {
}