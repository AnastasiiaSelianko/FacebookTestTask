package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static page_elements.LoginPageElements.*;

public class LoginPage extends BasePage {

    private static final String FACEBOOK_URL = "https://www.facebook.com/";

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public void openFacebook() {
        driver.get(FACEBOOK_URL);
    }

    public void setUpTest(final String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.driver", prop.getWebDriverPath());
            driver = new ChromeDriver(setUpOptions(options));

        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.driver", prop.getWebDriverPath());
            driver = new EdgeDriver();
        }
    }

    public void loginFacebook(final String login, final String password) {
        openFacebook();
        setLogin(login);
        setPassword(password);
        clickOnLoginButton();
        LOG.info("User was logged correctly");
    }

    public void setLogin(final String login) {
        driver.findElement(LOGIN_FIELD).clear();
        driver.findElement(LOGIN_FIELD).sendKeys(login);
    }

    public void setPassword(final String password) {
        driver.findElement(PASSWORD_FIELD).clear();
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
    }

    public void clickOnLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void logOutFacebook() {
        waitForElement(NAV_LABEL);
        driver.findElement(NAV_LABEL).click();
        LOG.info("Navigation label was clicked correctly");
        waitForElement(LOGOUT_BUTTON);
        driver.findElement(LOGOUT_BUTTON).click();
        LOG.info("Logout button was clicked correctly");
    }

    public void closeBrowser() {
        logOutFacebook();
        driver.close();
        driver.quit();
        LOG.info("Browser has been closed correctly");
    }

}

