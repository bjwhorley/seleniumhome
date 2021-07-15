package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHome {

//public static WebDriver driver = new ChromeDriver();

    public static void goToSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/brianwhorley/tools/chromedriver");
       WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("http://www.google.com");

        //get title information

        System.out.println(driver.getTitle());


    }
}
