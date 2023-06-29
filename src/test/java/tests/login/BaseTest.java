package tests.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import ua.hillel.pages.MainPage;
import ua.hillel.utils.DriverHolder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected WebDriver driver;

//    @BeforeSuite
//    public void  setDriver() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//    }
//
//    @BeforeClass
//    public void setUp() {
//        driver.get("https://the-internet.herokuapp.com/");
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void cleanUp() {
//      driver.manage().deleteAllCookies();
//    }
//
//    @AfterSuite(alwaysRun = true)
//    public void closeDriver() {
//        driver.quit();
//    }

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();


        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", new File("target/downloads").getAbsolutePath());
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        DriverHolder.setDriver(driver);

    }


    @AfterClass(alwaysRun = true)
    public void cleanUp() {
        driver.quit();
    }

    public MainPage openApp() {
        driver.get("https://the-internet.herokuapp.com/");
        return new MainPage();
    }
}
