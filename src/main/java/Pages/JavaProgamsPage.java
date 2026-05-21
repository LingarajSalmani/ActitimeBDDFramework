package Pages;

import org.openqa.selenium.WebDriver;

public class JavaProgamsPage extends BasePage{

	public JavaProgamsPage(WebDriver driver) {
		super(driver);
			
	}
	
	String url="http://localhost:8080/login.do";
	
	//Navigate to Actitime application
	public void LoginToApplication(){
		driver.navigate().to(url);
		System.out.println("Successfuly logged into Actitime application");
	}
}
  
