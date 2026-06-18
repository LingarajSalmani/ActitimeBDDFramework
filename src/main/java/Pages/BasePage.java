package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

	WebDriver driver;
	
	//Comment added
	 public BasePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
		this.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	
	
	
}
