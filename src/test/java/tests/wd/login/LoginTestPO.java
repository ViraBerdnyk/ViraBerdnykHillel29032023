package tests.wd.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pages.LoginPage;


public class LoginTestPO extends BaseTest {
    @Test
    public void loginTest() {

        LoginPage loginPage = openApp().openAuthPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .loginWithInvalidCreds();

        Assert.assertTrue(loginPage.getErrorText().contains("Your username is invalid!"));

    }
}