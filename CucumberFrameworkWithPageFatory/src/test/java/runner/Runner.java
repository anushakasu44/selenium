package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\anush\\eclipse-workspace\\CucumberFrameworkWithPageFatory\\Features",
glue="com.cucumberFramework_StepDefinations",
tags="@smoke",

monochrome=true,
plugin= {"pretty","html:target/myreport"})


public class Runner {

}
