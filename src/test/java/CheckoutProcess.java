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

public class CheckoutProcess {


    private static WebDriver browser;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void userShouldBeAblePayByCardOrPayPall() {
        browser.navigate().to(URL_APLIKACE);

        WebElement selectHotelBtn = browser.findElement(By.id("hotel_cat_name"));
        selectHotelBtn.click();
        WebElement selectThreeFoxesLounge = browser.findElement(By.xpath("//div/ul/li[@class='search_result_li']"));
        selectThreeFoxesLounge.click();

        WebElement selectCheckInBtn = browser.findElement(By.id("check_in_time"));
        selectCheckInBtn.click();

        WebElement selectDateOfCheckIn = browser.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[5]/td[7]/a"));
        selectDateOfCheckIn.click();

        WebElement selectCheckOutDateBtn = browser.findElement(By.id("check_out_time"));
        selectCheckOutDateBtn.click();

        WebElement selectDateOfCheckOut = browser.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[6]/td[1]/a"));
        selectDateOfCheckOut.click();

        WebElement searchOutBtn = browser.findElement(By.id("search_room_submit"));
        searchOutBtn.click();

        WebElement bookNowFullNatureExperience = browser.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div[2]/a/span"));
        bookNowFullNatureExperience.click();

        WebElement proceedToCheckOutBtn = browser.findElement(By.xpath("//div/a[@title='Proceed to checkout']"));
        proceedToCheckOutBtn.click();

        WebElement proceedBtn = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/section/div/section/div/div[1]/div/div[1]/div[2]/div/div[2]/div[2]/div/a/span"));
        proceedBtn.click();

        WebElement guestCheckOutBtn = browser.findElement(By.id("opc_guestCheckout"));
        guestCheckOutBtn.click();

        WebElement logInNowBtn = browser.findElement(By.id("openLoginFormBlock"));
        logInNowBtn.click();

        WebElement emailInput = browser.findElement(By.id("login_email"));
        emailInput.sendKeys("karel.franta.hotel@gmail.com");

        WebElement passwordInput = browser.findElement(By.id("login_passwd"));
        passwordInput.sendKeys("theAnswerIs42");

        WebElement signInBtn = browser.findElement(By.id("SubmitLogin"));
        signInBtn.click();

        WebElement proceedBtnInSummary = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/section/div/section/div/div[1]/div/div[2]/div[2]/div/div[4]/div/a"));
        proceedBtnInSummary.click();

        WebElement agreeOfTermsOfService = browser.findElement(By.id("cgv"));
        agreeOfTermsOfService.click();

        WebElement payWithYourCardOrPaypalAccountBtn = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/section/div/section/div/div[1]/div/div[3]/div[2]/div/div/div[2]/div[3]/div/div[3]/div/p/a"));
        payWithYourCardOrPaypalAccountBtn.click();

        WebElement errorAlert = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/h2"));

        Assertions.assertNotEquals("Error occurred:", errorAlert.getText());
    }

    @Test
    public void userShouldBeAblePayByMoneyTransfer() {
        browser.navigate().to(URL_APLIKACE);

        WebElement selectHotelBtn = browser.findElement(By.id("hotel_cat_name"));
        selectHotelBtn.click();
        WebElement selectThreeFoxesLounge = browser.findElement(By.xpath("//div/ul/li[@class='search_result_li']"));
        selectThreeFoxesLounge.click();

        WebElement selectCheckInBtn = browser.findElement(By.id("check_in_time"));
        selectCheckInBtn.click();

        WebElement selectDateOfCheckIn = browser.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[5]/td[7]/a"));
        selectDateOfCheckIn.click();

        WebElement selectCheckOutDateBtn = browser.findElement(By.id("check_out_time"));
        selectCheckOutDateBtn.click();

        WebElement selectDateOfCheckOut = browser.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[6]/td[1]/a"));
        selectDateOfCheckOut.click();

        WebElement searchOutBtn = browser.findElement(By.id("search_room_submit"));
        searchOutBtn.click();

        WebElement bookNowFullNatureExperience = browser.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div[2]/a/span"));
        bookNowFullNatureExperience.click();

        WebElement proceedToCheckOutBtn = browser.findElement(By.xpath("//div/a[@title='Proceed to checkout']"));
        proceedToCheckOutBtn.click();

        WebElement proceedBtn = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/section/div/section/div/div[1]/div/div[1]/div[2]/div/div[2]/div[2]/div/a/span"));
        proceedBtn.click();

        WebElement guestCheckOutBtn = browser.findElement(By.id("opc_guestCheckout"));
        guestCheckOutBtn.click();

        WebElement logInNowBtn = browser.findElement(By.id("openLoginFormBlock"));
        logInNowBtn.click();

        WebElement emailInput = browser.findElement(By.id("login_email"));
        emailInput.sendKeys("karel.franta.hotel@gmail.com");

        WebElement passwordInput = browser.findElement(By.id("login_passwd"));
        passwordInput.sendKeys("theAnswerIs42");

        WebElement signInBtn = browser.findElement(By.id("SubmitLogin"));
        signInBtn.click();

        WebElement proceedBtnInSummary = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/section/div/section/div/div[1]/div/div[2]/div[2]/div/div[4]/div/a"));
        proceedBtnInSummary.click();

        WebElement agreeOfTermsOfService = browser.findElement(By.id("cgv"));
        agreeOfTermsOfService.click();

        WebElement payByMoneyTransferBtn = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/section/div/section/div/div[1]/div/div[3]/div[2]/div/div/div[2]/div[3]/div/div[1]/div/p/a"));
        payByMoneyTransferBtn.click();

        WebElement iConfirmMyOrderBtn = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/form/p/button"));
        iConfirmMyOrderBtn.click();

        WebElement viewMyOrderHistoryBtw = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/p/a"));
        viewMyOrderHistoryBtw.click();

        WebElement orderHistoryHeader = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/h1"));

        Assertions.assertEquals("ORDER HISTORY", orderHistoryHeader.getText());
    }

    @Test
    public void userShouldBeAblePayByCheck() {
        browser.navigate().to(URL_APLIKACE);

        WebElement selectHotelBtn = browser.findElement(By.id("hotel_cat_name"));
        selectHotelBtn.click();
        WebElement selectThreeFoxesLounge = browser.findElement(By.xpath("//div/ul/li[@class='search_result_li']"));
        selectThreeFoxesLounge.click();

        WebElement selectCheckInBtn = browser.findElement(By.id("check_in_time"));
        selectCheckInBtn.click();

        WebElement selectDateOfCheckIn = browser.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[5]/td[7]/a"));
        selectDateOfCheckIn.click();

        WebElement selectCheckOutDateBtn = browser.findElement(By.id("check_out_time"));
        selectCheckOutDateBtn.click();

        WebElement selectDateOfCheckOut = browser.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[6]/td[1]/a"));
        selectDateOfCheckOut.click();

        WebElement searchOutBtn = browser.findElement(By.id("search_room_submit"));
        searchOutBtn.click();

        WebElement bookNowFullNatureExperience = browser.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div[2]/a/span"));
        bookNowFullNatureExperience.click();

        WebElement proceedToCheckOutBtn = browser.findElement(By.xpath("//div/a[@title='Proceed to checkout']"));
        proceedToCheckOutBtn.click();

        WebElement proceedBtn = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/section/div/section/div/div[1]/div/div[1]/div[2]/div/div[2]/div[2]/div/a/span"));
        proceedBtn.click();

        WebElement guestCheckOutBtn = browser.findElement(By.id("opc_guestCheckout"));
        guestCheckOutBtn.click();

        WebElement logInNowBtn = browser.findElement(By.id("openLoginFormBlock"));
        logInNowBtn.click();

        WebElement emailInput = browser.findElement(By.id("login_email"));
        emailInput.sendKeys("karel.franta.hotel@gmail.com");

        WebElement passwordInput = browser.findElement(By.id("login_passwd"));
        passwordInput.sendKeys("theAnswerIs42");

        WebElement signInBtn = browser.findElement(By.id("SubmitLogin"));
        signInBtn.click();

        WebElement proceedBtnInSummary = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/section/div/section/div/div[1]/div/div[2]/div[2]/div/div[4]/div/a"));
        proceedBtnInSummary.click();

        WebElement agreeOfTermsOfService = browser.findElement(By.id("cgv"));
        agreeOfTermsOfService.click();

        WebElement payByCheck = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/section/div/section/div/div[1]/div/div[3]/div[2]/div/div/div[2]/div[3]/div/div[2]/div/p/a"));
        payByCheck.click();

        WebElement iConfirmMyOrderBtn = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/form/p/button"));
        iConfirmMyOrderBtn.click();

        WebElement viewMyOrderHistoryBtw = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/p/a"));
        viewMyOrderHistoryBtw.click();

        WebElement orderHistoryHeader = browser.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/h1"));

        Assertions.assertEquals("ORDER HISTORY", orderHistoryHeader.getText());
    }

    @AfterEach
    public void tearDown() {
        browser.close();
    }
}
