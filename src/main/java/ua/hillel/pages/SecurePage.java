package ua.hillel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage {


    public SecurePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage logout() {
        driver.findElement(By.cssSelector("a.button")).click();
        return new LoginPage(driver);
    }

    public String getTitle() {
        return driver.findElement(By.xpath("//h2")).getText();
    }
}
