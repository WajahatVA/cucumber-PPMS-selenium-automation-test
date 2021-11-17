package com.va.ppms.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
            monochrome = true, 
            features = {"src/test/java/com/va/ppms/features/" }, 
            glue = {"com.va.ppms.steps" }, 
            tags= {"@SystemAdministrator"}, 
			plugin = { "pretty", 
					"html:target/cucumber-reports", "html:target/site/cucumber-html", 
					"json:target/cucumber1.json" })

public class Runner {

}


