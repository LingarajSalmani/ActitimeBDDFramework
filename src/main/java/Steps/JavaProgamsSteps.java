package Steps;


import Cucumber.TestContext;
import Pages.JavaProgamsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;

public class JavaProgamsSteps {

	TestContext testContext;
	
	//AccountInformationPage accountInformation;
	//Excel excel;
	JavaProgamsPage javaPrograms;

	public JavaProgamsSteps(TestContext context) {
		testContext = context;
		javaPrograms = testContext.getWebPageObjectManager().getLoginPage();
	}

	//JavaProgamsPage page;
	@Given("^User enters Actitime Application url \"([^\"]*)\" in browser$")
	public void user_enters_Actitime_Application_url_in_browser(String url) throws Throwable {

		javaPrograms.LoginToApplication(url);
	}

	@Then("^Actitime Application should be open successfully$")
	public void actitime_Application_should_be_open_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}


}
