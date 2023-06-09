package tests.wd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WdTest {
    @Test
//    @Parameters({"browser"})
    public void wdTest() {
        WebDriver driver = null;
//        if (browser.equalsIgnoreCase("ff")) {
//            WebDriverManager.firefoxdriver().setup();
//            driver = new FirefoxDriver();
//        } else if (browser.equalsIgnoreCase("chrome")) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//        }
        driver.get("https://google.com");

        System.out.println((driver.getTitle()));

        driver.quit();


    }
}
