package Cucumber;

import Managers.WebDriverManager;
import Managers.WebPageObjectManager;

public class TestContext {

	//private static EnvironmentType environmentType;
	private WebDriverManager webDriverManager;
	private WebPageObjectManager webPageObjectManager;

	public TestContext() {
		webDriverManager = new WebDriverManager();
		//environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
		
			webPageObjectManager = new WebPageObjectManager(webDriverManager.getDriver());
			
		
		}
	

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public WebPageObjectManager getWebPageObjectManager() {
		return webPageObjectManager;
	}

}
