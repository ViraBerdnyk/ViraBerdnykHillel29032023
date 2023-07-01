package tests.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;

public class SelenideLoginTest {
    @Test
    public void selenideLoginTest() throws FileNotFoundException {
        Configuration.downloadsFolder = "target/downloads/";
        Configuration.savePageSource = false;
        Configuration.timeout = 10;

        open("https://the-internet.herokuapp.com/");

        $(By.linkText("Form Authentication")).click();

        SelenideElement username = $("#username");

        username.should(Condition.exist).clear();
        username.sendKeys("tomsmith");

        SelenideElement passwordInput = $x("//input[@id='password']");
        passwordInput.clear();
        passwordInput.sendKeys("SuperSecretPassword!");

        $(".radius").click();
    }
}

