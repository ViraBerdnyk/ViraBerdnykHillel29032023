package ua.hillel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UploadPage extends BasePage {

    @FindBy(id = "uploaded-files")
    private WebElement successMessage;

    public UploadPage() {
        super();
        PageFactory.initElements(driver, this);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("file-upload")));
    }

    public void uploadFile(String filePath) {
        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys(filePath);

        WebElement fileUploadButton = driver.findElement(By.id("file-submit"));
        fileUploadButton.click();
    }

    public String getSuccessMessage() {
        webDriverWait.until(ExpectedConditions.visibilityOf(successMessage));
        return successMessage.getText();
    }
}