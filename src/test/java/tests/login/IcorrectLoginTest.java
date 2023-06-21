package tests.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IcorrectLoginTest {
    @Test
    public void incorrectLoginTest() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Form Authentication")).click();

        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("tomsmith");
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("InvalidPassworddd");

        driver.findElement(By.cssSelector(".radius")).click();

        //invalid assert

        driver.quit();
    }

}
