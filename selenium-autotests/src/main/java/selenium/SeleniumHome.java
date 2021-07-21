package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHome {

    static WebDriver driver;

    public WebDriver getDriver() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/brianwhorley/tools/chromedriver");

        driver = new ChromeDriver();

        return driver;

    }

    public static void closeTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/brianwhorley/tools/chromedriver");

        driver.quit();

    }
}
