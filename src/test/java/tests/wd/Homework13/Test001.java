package tests.wd.Homework13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
    @Test
    public void dragAndDropTest() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        WebElement dragElement = driver.findElement(By.id("draggable"));
        WebElement dropArea = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement, dropArea).build().perform();

        String dropText = dropArea.getText();
        Assert.assertEquals(dropText, "Dropped!");

        driver.quit();
    }
}
