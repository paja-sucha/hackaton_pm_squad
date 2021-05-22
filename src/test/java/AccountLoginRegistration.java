import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static constants.BasicConstants.*;
import static generalMethods.General.*;

public class AccountLoginRegistration {


    private static WebDriver browser;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void theUserShouldBeAbleToLogin() {
        browser.navigate().to(URL_APLIKACE);

        goToLoginPage(browser);
        logIn(browser, "karel.franta.hotel@gmail.com", "theAnswerIs42");

        WebElement loggedInBtn = browser.findElement(By.xpath("//div/ul/li/button/span[" + xpathClassNamePrefix("account_user_name") + "]"));
        Assertions.assertEquals("Karel", loggedInBtn.getText(), "Login FAILED");
    }

    @Test
    public void theUserShouldBeAbleToUseBasicLinks() {
        browser.navigate().to(URL_APLIKACE);

        goToLoginPage(browser);
        logIn(browser, "karel.franta.hotel@gmail.com", "theAnswerIs42");

        WebElement orderHistoryBtn = browser.findElement(By.xpath("//a[@title='Orders']"));
        orderHistoryBtn.click();
        WebElement orderHistoryHeader = browser.findElement(By.xpath("//div[@id='center_column']/h1"));

        Assertions.assertEquals("ORDER HISTORY", orderHistoryHeader.getText());

        WebElement backToYourAccountBtn = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/ul/li[1]/a"));
        backToYourAccountBtn.click();

        WebElement myCreditSlips = browser.findElement(By.xpath("//a[@title='Credit slips']"));
        myCreditSlips.click();
        WebElement creditSlipsHeader = browser.findElement(By.xpath("//div[@id='center_column']/h1"));

        Assertions.assertEquals("CREDIT SLIPS", creditSlipsHeader.getText());

        WebElement backToYourAccountFromCreditBtn = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/ul/li[1]/a"));
        backToYourAccountFromCreditBtn.click();

        WebElement myAddresses = browser.findElement(By.xpath("//a[@title='Addresses']"));
        myAddresses.click();

        WebElement myAddressesHeader = browser.findElement(By.xpath("//div[@id='center_column']/h1"));

        Assertions.assertEquals("MY ADDRESSES", myAddressesHeader.getText());
    }

    @AfterEach
    public void tearDown() {
        browser.close();
    }


}
