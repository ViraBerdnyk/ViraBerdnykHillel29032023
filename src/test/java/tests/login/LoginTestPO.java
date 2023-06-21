package tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pages.LoginPage;


public class LoginTestPO extends BaseTest {
    @Test
    public void loginTest() {

        LoginPage loginPage = openApp().openAuthPage()
                .setUsername("tomsmith1111")
                .setPassword("SuperSecretPassword")
                .loginWithInvalidCreds();

        Assert.assertTrue(loginPage.getErrorText().contains("Your username is invalid"));

    }
}
