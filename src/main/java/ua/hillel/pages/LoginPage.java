package ua.hillel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = ".radius")
    private WebElement loginButton;

    @FindBy(css = ".flash.error")
    private WebElement errorPopup;

    @FindBy(css = "")
    List<WebElement> list;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage setUsername(String username) {
        setFieldValue(usernameInput, username);
        return this;
    }

    public LoginPage setPassword(String password) {
        setFieldValue(passwordInput, password);
        return this;
    }

    public SecurePage clickLoginButton() {
        clickButton(loginButton);
        return new SecurePage(driver);
    }

    public LoginPage loginWithInvalidCreds() {
        clickButton(loginButton);
        return this;
    }

    public String getErrorText() {
        return errorPopup.getText();

    }

    public SecurePage login(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }
}

