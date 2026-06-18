package Pages;

import org.openqa.selenium.WebDriver;

public class JavaProgamsPage extends BasePage{

	public JavaProgamsPage(WebDriver driver) {
		super(driver);
			
	}
	
	//String url="https://www.amazon.in/";
	
	//Navigate to Actitime application
	public void LoginToApplication(String url){
		driver.navigate().to(url);
		System.out.println("Successfuly logged into Amazon application");
	}
}
  
