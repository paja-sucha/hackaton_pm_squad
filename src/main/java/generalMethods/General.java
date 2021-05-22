package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class General {


    public static void goToLoginPage(WebDriver browser) {
        WebElement logInBtn = browser.findElement(By.className("user_login"));
        logInBtn.click();
    }

    public static void logIn(WebDriver browser, String email, String password) {
        enterEmail(browser, email);
        enterPassword(browser, password);
        clickOnLogInBtn(browser);
    }

    public static void enterEmail(WebDriver browser, String email) {
        WebElement emailField = browser.findElement(By.id("email"));
        emailField.sendKeys(email);
    }

    public static void enterPassword(WebDriver browser, String password) {
        WebElement passwordField = browser.findElement(By.id("passwd"));
        passwordField.sendKeys(password);
    }

    public static void clickOnLogInBtn(WebDriver browser) {
        WebElement singInBtn = browser.findElement(By.id("SubmitLogin"));
        singInBtn.click();
    }
}
