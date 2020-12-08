package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class WithConfigurationTest {
    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    private void beforeAll(){
        driver = browserGetter.getDriver();
    }

    @AfterAll
    private void afterAll(){
        driver.quit();
    }

    @Test
     void justTest(){
        driver.get("https://www.example.com");
        assertEquals("Example Domain",driver.getTitle());

    }
}
