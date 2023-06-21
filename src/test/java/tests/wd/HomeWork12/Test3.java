package tests.wd.HomeWork12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ua.hillel.pages.CheckboxesPage;
import ua.hillel.pages.MainPage;

import java.util.List;

@Test

public class Test3 {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void testSuccessfulLogin() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.toggleCheckboxes();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

