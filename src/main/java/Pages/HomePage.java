package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
			
	}
	
	//String url="https://www.amazon.in/";
	
	//Navigate to Actitime application
//	public void LoginToApplication(String url){
//		driver.navigate().to(url);
//		System.out.println("Successfuly logged into Amazon application");
//	}

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBox;

	// Launch Amazon
	public void launchAmazon() {
		driver.get("https://www.amazon.in");
		System.out.println("Amazon web site opend successfully");
	}

	// Verify Home Page
	public void verifyHomePage() {
		String title = driver.getTitle();
		System.out.println(title);
		boolean isPresent=false;
		if(title.contains("Amazon")){
			isPresent=true;
		}
		Assert.assertTrue(isPresent);
		System.out.println("Amazon home page displayed");
	}

	// Verify Search Box
	public void verifySearchBoxDisplayed() {
		boolean isPresent=searchBox.isDisplayed();
		Assert.assertTrue(isPresent, "Search box is not displayed");
		System.out.println("Search box is displayed");
	}
}
  
