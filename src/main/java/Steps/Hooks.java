package Steps;

import Cucumber.TestContext;
import Managers.WebDriverManager;
import Pages.BasePage;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Hooks{
   TestContext context;

    public Hooks(TestContext context) {
        this.context=context;
    }

//
//    public Hooks(WebDriver driver){
//      super(driver);
//    }
    @After
    public void teardown(){
       context.getWebDriverManager().close();
    }
}
