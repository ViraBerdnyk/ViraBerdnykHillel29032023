package tests.wd.files;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.wd.login.BaseTest;
import ua.hillel.pages.DownloadPage;
import ua.hillel.pages.MainPage;
import ua.hillel.pages.UploadPage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileHwTest extends BaseTest {
    @Test
    public void fileTest() throws IOException {
        MainPage mainPage = openApp();


        DownloadPage downloadPage = mainPage.openDownloadPage();
        String downloadedFilePath = downloadPage.downloadFile("amar.txt");


        String fileContentToAdd = "\nNew content";
        Files.write(Paths.get(downloadedFilePath), fileContentToAdd.getBytes(), StandardOpenOption.APPEND);


        UploadPage uploadPage = mainPage.openUploadPage();
        uploadPage.uploadFile(downloadedFilePath);


        String successMessage = uploadPage.getSuccessMessage();
        Assert.assertEquals(successMessage, "amar.txt", "File was not uploaded successfully.");
    }

}