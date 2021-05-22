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

public class ReservationProces {


    private static WebDriver browser;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //TODO: Opened in a new tab, improve code to stack over that
    /*
    @Test
    public void theUnregisteredUserShouldBeAbleToBookARoom() {
        browser.navigate().to(URL_APLIKACE);

        WebElement bookBudgetCabin = browser.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div[1]/div[1]/div/div[3]/a"));
        bookBudgetCabin.click();
        WebElement subtotal = browser.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[7]/div[1]/p"));
        System.out.println(subtotal);

    }
    */

    @Test
    public void shouldDo() {
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

        WebElement searchRoomBtn = browser.findElement(By.id("search_room_submit"));

        Assertions.assertEquals("SEARCH ROOMS", searchRoomBtn.getText(), "The room menu page is not displayed");
    }


    @AfterEach
    public void tearDown() {
        browser.close();
    }


}
