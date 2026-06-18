package Steps;


import Cucumber.TestContext;
import Pages.HomePage;
import Pages.JavaProgamsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;

public class HomePageSteps {

	TestContext testContext;

	//AccountInformationPage accountInformation;
	//Excel excel;
	HomePage homePage;

	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getWebPageObjectManager().getHomePage();
	}

	@Given("User opens Amazon website")
	public void user_opens_amazon_website() {
		homePage.launchAmazon();
	}

	@When("User is in home page")
	public void user_is_in_home_page() {
		homePage.verifyHomePage();
	}

	@Then("Search box should be display")
	public void search_box_should_be_display() {
		homePage.verifySearchBoxDisplayed();
	}


}
