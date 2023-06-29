package ua.hillel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;

public class DownloadPage extends BasePage {

    public DownloadPage() {
        super();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Demo.txt")));
    }

    public String downloadFile(String fileName) {
        WebElement fileLink = driver.findElement(By.linkText(fileName));
        fileLink.click();

        String downloadFolderPath = new File("target/downloads").getAbsolutePath();
        return downloadFolderPath + File.separator + fileName;
    }
}
