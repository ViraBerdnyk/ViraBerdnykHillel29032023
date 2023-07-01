package ua.hillel.pages.selenidePages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class UploadPageSel {
    private SelenideElement fileInput = $("#file-upload");
    private SelenideElement fileUploadButton = $("#file-submit");

    public void uploadFile(String filePath) {
        fileInput.uploadFromClasspath(filePath);
        fileUploadButton.click();
    }
}
