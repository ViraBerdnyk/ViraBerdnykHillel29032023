package tests.wd.HomeWork12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Test1 {
    @Test
    public void tableValues() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");


        int buttonCount = driver.findElements(By.cssSelector("div.large-2.columns a")).size();

        for (int i = 0; i < buttonCount; i++) {

            List<WebElement> buttons = driver.findElements(By.cssSelector("div.large-2.columns a"));
            buttons.get(i).click();
        }

        List<WebElement> columnValues = driver.findElements(By.cssSelector("table tr td:nth-child(4)"));
        for (WebElement value : columnValues) {
            System.out.println(value.getText());
        }

        driver.quit();
    }
}

