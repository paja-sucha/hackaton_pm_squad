import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static constants.BasicConstants.*;

public class TestTemplate {


    private static WebDriver browser;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void shouldDo() {
        browser.navigate().to(URL_APLIKACE);
    }

    @AfterEach
    public void tearDown() {
        browser.close();
    }
}
