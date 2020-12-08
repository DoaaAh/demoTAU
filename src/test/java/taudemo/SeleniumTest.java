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
 class SeleniumTest {

    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
     void beforeAll() {
        driver = browserGetter.getDriver();
    }

    @AfterAll
     void afterAll() {
        driver.quit();
    }

    @Test
     void OpenTheComPageAndCheckTheTitle() {
        String ExpectedComTitle = "Google";
        driver.get("https://www.google.com");
        assertEquals(ExpectedComTitle, driver.getTitle());
    }

    @Test
     void OpenTheOrgPageAndCheckTheTitle() {
        String ExpectedOrgTitle = "Example Domain";
        driver.get("https://www.example.org");
        assertEquals(ExpectedOrgTitle, driver.getTitle());
    }

}
