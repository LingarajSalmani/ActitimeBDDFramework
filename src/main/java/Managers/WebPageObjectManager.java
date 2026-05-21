package Managers;

import org.openqa.selenium.WebDriver;


import Pages.JavaProgamsPage;

public class WebPageObjectManager {
	private WebDriver driver;
	private JavaProgamsPage loginPage;
	
	public WebPageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public JavaProgamsPage getLoginPage() {
		return (loginPage == null) ? loginPage = new JavaProgamsPage(this.driver) : loginPage;
	}

	
	
	
	
}
