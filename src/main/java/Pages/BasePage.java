package Pages;

import java.util.concurrent.TimeUnit;

import Cucumber.TestContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

	WebDriver driver;
	//TestContext context;
	//Comment added
	 public BasePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
		this.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
//	public BasePage(TestContext context){
//		this.context=context;
//		PageFactory.initElements(this.context.getWebDriverManager().getDriver(), this);
//		this.context.getWebDriverManager().getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	}
	
	
	
}
