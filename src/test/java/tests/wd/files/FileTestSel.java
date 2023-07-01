package tests.wd.files;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import ua.hillel.pages.selenidePages.DownloadPageSel;
import ua.hillel.pages.selenidePages.UploadPageSel;

import static com.codeborne.selenide.Selenide.open;

public class FileTestSel {
    @Test
    public void downloadTest() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.downloadsFolder = "target/downloads";

        open("/download");
        DownloadPageSel downloadPage = new DownloadPageSel("Text.txt");
        downloadPage.downloadFile();
    }

    @Test
    public void uploadTest() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";

        open("/upload");
        UploadPageSel uploadPage = new UploadPageSel();

        // Replace "path/to/your/file" with the actual path to the file you want to upload
        uploadPage.uploadFile("target/downloads/1688164479438_4596_1/Text.txt");
    }
}

