package tests.wd.HomeWork12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

@Test

public class Test3 {
    @Test
    public void testSuccessfulLogin() {
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));


        for (WebElement checkbox : checkboxes) {
            System.out.println("Initial state: " + checkbox.isSelected());
            checkbox.click();
            System.out.println("State after click: " + checkbox.isSelected());
        }

        driver.quit();
    }
}


