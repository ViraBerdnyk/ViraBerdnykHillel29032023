package tests.wd.HomeWork12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
    @Test
    public void testSuccessfulLogin() {
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");


        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));


        usernameField.sendKeys("tomsmith");
        passwordField.sendKeys("SuperSecretPassword!");

        WebElement loginButton = driver.findElement(By.cssSelector("button"));
        loginButton.click();

        WebElement successMessage = driver.findElement(By.id("flash"));
        Assert.assertTrue(successMessage.getText().contains("You logged into a secure area!"));

        driver.quit();
    }

    @Test
    public void testUnsuccessfulLogin() {
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys("wrongusername");
        passwordField.sendKeys("wrongpassword");

        WebElement loginButton = driver.findElement(By.cssSelector("button"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.id("flash"));
        Assert.assertTrue(errorMessage.getText().contains("Your username is invalid!"));

        driver.quit();
    }
}


