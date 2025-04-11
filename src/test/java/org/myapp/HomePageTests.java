package org.myapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {

    @Test
    public void TC_001_homePageTest() {
        driver.get(baseUrl + "/mainpage.html");

        Assert.assertEquals(driver.findElement(By.cssSelector("body > section > div > div > h1")).getText(), "Gabriela & Alin");
        Assert.assertEquals(driver.findElement(By.cssSelector("body > section > div > div > p:nth-child(2)")).getText(), "~ 24.08.2024 ~");
        Assert.assertEquals(driver.findElement(By.cssSelector("#countdown")).getText(), "Astăzi este ziua cea mare! \uD83C\uDF89");

        System.out.println("Home Page is successful");
    }

    @Test
    public void TC_002_navigateMenuToLoginPage() {
        driver.get(baseUrl + "/mainpage.html");

        driver.findElement(By.cssSelector("#nav-menu > li:nth-child(2) > a")).click();

        WebElement loginTitle = driver.findElement(By.cssSelector("body > section > h2"));
        Assert.assertEquals(loginTitle.getText(), "Login");

        System.out.println("Navigated to Login Page");
    }

    @Test
    public void TC_003_navigateMenuToSignUpPage() {
        driver.get(baseUrl + "/mainpage.html");

        driver.findElement(By.cssSelector("#nav-menu > li:nth-child(3) > a")).click();

        WebElement loginTitle = driver.findElement(By.cssSelector("body > section > h2"));
        Assert.assertEquals(loginTitle.getText(), "Sign Up");

        System.out.println("Navigated to Sign Up Page");
    }
}
