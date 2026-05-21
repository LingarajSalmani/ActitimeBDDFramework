package com.runner.TestRunner;




import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Class to start the execution.
 */

@CucumberOptions(features = { "Features" }, glue = { "Steps" },
		tags = { "@Regression" })
				//tags = { "@TestActitime" },
		// plugin = { "ru.yandex.qatools.allure.cucumberjvm.AllureReporter",
		// "pretty","rerun:target/rerun.txt" },
		//plugin = { "io.qameta.allure.cucumberjvm.AllureCucumberJvm", "pretty" }, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

}
