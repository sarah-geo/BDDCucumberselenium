package com.expedia.BDDCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = "src/test/java/feature/",
		glue = {"stepdefinition"})

public class testrun {


}
