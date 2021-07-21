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

    public static void goToEspn(){

        driver.get("https://www.espn.com/");
    }

    public static void closeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/brianwhorley/tools/chromedriver");
        Thread.sleep(500);
        driver.quit();

    }
}
