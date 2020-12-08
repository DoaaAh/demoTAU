package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static java.lang.System.setProperty;


public class BrowserGetter {

    public WebDriver getDriver() {
        switch (System.getProperty("browser").toLowerCase()) {
            case "chrome" :
                System.out.println("Chrome was chosen!");
                return getChromeDriver();
            case "firefox" :
                System.out.println("Firefox was chosen!");
                return getFirefoxDriver();
            default:
                throw new RuntimeException("Unsupported browser! Will not start any browser!");
        }
    }
    private WebDriver getChromeDriver() {

        setProperty("webdriver.chrome.driver", "/home/doaa/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
    private WebDriver getFirefoxDriver() {

        setProperty("webdriver.chrome.driver", "src/test/resources/browserBinaries/chromedriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

}
