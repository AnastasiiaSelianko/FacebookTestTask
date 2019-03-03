package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import properties.Prop;

import java.util.logging.Logger;

public class BasePage {

    public static Prop prop = new Prop();
    public Logger log;

    public BasePage() {
        log = Logger.getLogger(this.getClass().getSimpleName());
    }

    public static ChromeOptions options = new ChromeOptions();
    public static WebDriver driver = new ChromeDriver(setUpOptions(options));

    public static ChromeOptions setUpOptions(ChromeOptions options) {
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", prop.getWebDriverPath());
        return options;
    }

    public void waitForElement(By element) {
        WebElement wait = (new WebDriverWait(driver, 60)).
                until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementDisplayed(By element) {
        WebElement wait = (new WebDriverWait(driver, 60)).
                until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isOpened() {
        return getPageUrl().equals(driver.getCurrentUrl());
    }

    public void closeBrowser() {
        driver.quit();
    }

}
