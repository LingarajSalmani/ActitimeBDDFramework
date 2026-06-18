package Managers;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;


import Pages.JavaProgamsPage;

public class WebPageObjectManager {
	private WebDriver driver;
	private JavaProgamsPage loginPage;
	private HomePage homePage;
	
	public WebPageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public JavaProgamsPage getLoginPage() {
		return (loginPage == null) ? loginPage = new JavaProgamsPage(this.driver) : loginPage;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(this.driver) : homePage;
	}

	
	
	
	
}
