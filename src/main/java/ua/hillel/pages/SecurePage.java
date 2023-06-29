package ua.hillel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage {


    public LoginPage logout() {
        driver.findElement(By.cssSelector("a.button")).click();
        return new LoginPage();
    }

    public String getTitle() {

        return driver.findElement(By.xpath("//h2")).getText();
    }
}
