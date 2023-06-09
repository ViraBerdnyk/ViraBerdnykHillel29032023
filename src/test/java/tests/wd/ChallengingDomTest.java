package tests.wd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ChallengingDomTest {
    @Test
    public void tableValues() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");


        List<String> tableTexts = driver.findElements(By.cssSelector("table tr td:nth-of-type(4)"))
                .stream().map(WebElement::getText).collect(Collectors.toList());

        System.out.println(tableTexts);

        driver.quit();

    }
}