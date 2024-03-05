package Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.env;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends env{
    static WebDriver driver;

    @Before
    public void browserSetup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(MagentoLink);
    }

    @After
    public void browserTeardown(){
        driver.quit();
    }
}
