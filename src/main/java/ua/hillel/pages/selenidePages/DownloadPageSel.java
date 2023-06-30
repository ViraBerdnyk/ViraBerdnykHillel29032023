package ua.hillel.pages.selenidePages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DownloadPageSel {
    private SelenideElement fileLink;

    public DownloadPageSel(String fileName) {
        this.fileLink = $("a[href='download/" + fileName + "']");
    }

    public void downloadFile() {
        fileLink.click();
    }
}
