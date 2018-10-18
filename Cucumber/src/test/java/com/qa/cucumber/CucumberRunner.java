package com.qa.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\Desktop\\Michal Mionskowski\\Cucumber\\src\\test\\java\\Parametisation.feature", glue = {"com.qa.cucumber"})
	

	
public class CucumberRunner {

}
