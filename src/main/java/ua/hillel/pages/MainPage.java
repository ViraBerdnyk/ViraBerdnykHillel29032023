package ua.hillel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public LoginPage openAuthPage() {
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage();
    }

    public UploadPage openUploadPage() {
        driver.get("https://the-internet.herokuapp.com/upload");
        return new UploadPage();
    }

    public DownloadPage openDownloadPage() {
        driver.get("https://the-internet.herokuapp.com/download");
        return new DownloadPage();
    }
}




