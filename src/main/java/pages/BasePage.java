package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import properties.Prop;

import java.util.logging.Logger;

public class BasePage {

    public static Prop prop = new Prop();
    public static WebDriver driver;
    public static ChromeOptions options = new ChromeOptions();
    public final Logger LOG;

    public BasePage() {
        LOG = Logger.getLogger(this.getClass().getSimpleName());
    }

    public static ChromeOptions setUpOptions(ChromeOptions options) {
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.driver", prop.getWebDriverPath());
        return options;
    }

    public void waitForElement(By element) {
        WebElement wait = (new WebDriverWait(driver, 60)).
                until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isOpened() {
        return getPageUrl().equals(driver.getCurrentUrl());
    }

}
