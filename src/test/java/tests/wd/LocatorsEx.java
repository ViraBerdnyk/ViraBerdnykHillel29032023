package tests.wd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsEx {
    @Test
    public void locatorsTest() {
        WebDriverManager.chromedriver();

        WebDriver driver = new ChromeDriver();

        driver.findElement(By.className("row")).findElement(By.tagName("a"));
        driver.findElement(By.partialLinkText("and Drop"));
    }
}
