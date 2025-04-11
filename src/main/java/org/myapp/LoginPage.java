package org.myapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private static final String EMAIL_ID = "email";
    private static final String PASSWORD_ID = "password";

    private static final String EMAIL_SELECTOR = "#email";
    private static final String PASSWORD_SELECTOR = "#password";
    private static final String LOGIN_BUTTON_SELECTOR = "#login-form > button";

    private static final String HEADER_TEXT_SELECTOR = "body > section > h2";
    private static final String HEADER_STATIC_TEXT = "Login";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        WebElement email_field = driver.findElement(By.cssSelector(EMAIL_SELECTOR));
        WebElement password_field = driver.findElement(By.cssSelector(PASSWORD_SELECTOR));
        WebElement login_button = driver.findElement(By.cssSelector(LOGIN_BUTTON_SELECTOR));

        email_field.clear();
        email_field.sendKeys(email);

        password_field.clear();
        password_field.sendKeys(password);

        login_button.click();
    }

    public String getHeaderText() {
        return driver.findElement(By.cssSelector(HEADER_TEXT_SELECTOR)).getText();
    }

    public String getHeaderStaticText() {
        return HEADER_STATIC_TEXT;
    }

    public String getEmailFieldValue() {
        return driver.findElement(By.id(EMAIL_SELECTOR)).getAttribute("value");
    }
}
