package Managers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;



import Utilities.IConstants;

public class WebDriverManager implements IConstants{

	private WebDriver web_driver;
	private EventFiringWebDriver driver;
	private String present_path;
	public static WebDriverManager webDriverManager = new WebDriverManager();
	
	public WebDriver getDriver() {
		if (driver == null)
			driver = (EventFiringWebDriver) createDriver();
		return driver;
	}

	private WebDriver createDriver() {
		if (driver == null)
			driver = (EventFiringWebDriver) createLocalDriver();
		return driver;
	}

	private WebDriver createLocalDriver() {
		present_path = System.getProperty("user.dir");
		String chrome_driver = present_path + CHROME_PATH;
		System.setProperty(CHROME_KEY, chrome_driver);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("safebrowsing.enabled", "true");
		options.setExperimentalOption("prefs", prefs);
		System.out.println("Launching");
		web_driver = new ChromeDriver(options);
		
		Utilities.MyListeners listener = new Utilities.MyListeners();
		driver = new EventFiringWebDriver(web_driver);
		driver.register(listener);
		
		driver.manage().window().maximize();
		//driver.get(Utilities.FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		//driver.manage().timeouts().implicitlyWait(Utilities.FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(),
				//TimeUnit.SECONDS);

		return driver;
	}


}
