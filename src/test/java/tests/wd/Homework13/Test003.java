package tests.wd.Homework13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;


public class Test003 {
    @Test
    public void hoverMenuTest() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);

        List<WebElement> users = driver.findElements(By.className("figure"));

        for (WebElement user : users) {

            actions.moveToElement(user).perform();

            WebElement usernameElement = user.findElement(By.className("figcaption"));
            System.out.println(usernameElement.getText());
        }

        driver.quit();
    }
}


