package com.runner.TestRunner;




//import cucumber.api.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
/**
 * Class to start the execution.
 */

@CucumberOptions(
		features = "src/test/resources/Features/Amazon/HomePage.feature",
		glue = "Steps",
		tags = "@Test",
		plugin = {"pretty"})
				//tags = { "@TestActitime" },
		// plugin = { "ru.yandex.qatools.allure.cucumberjvm.AllureReporter",
		// "pretty","rerun:target/rerun.txt" },
		//plugin = { "io.qameta.allure.cucumberjvm.AllureCucumberJvm", "pretty" }, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

}
