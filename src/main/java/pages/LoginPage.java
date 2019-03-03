package pages;

import static page_elements.LoginPageElements.*;

public class LoginPage extends BasePage {

    private static final String FACEBOOK_URL = "https://www.facebook.com/";

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public void openFacebook() {
        driver.get(FACEBOOK_URL);
    }

    public void loginFacebook(String login, String password) {
        openFacebook();
        setLogin(login);
        setPassword(password);
        clickOnLoginButton();
        log.info("User was logged correctly");
    }

    public void setLogin(String login) {
        driver.findElement(LOGIN_FIELD).clear();
        driver.findElement(LOGIN_FIELD).sendKeys(login);
    }

    public void setPassword(String password) {
        driver.findElement(PASSWORD_FIELD).clear();
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
    }

    public void clickOnLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public boolean isUserIconDisplayed() {
        return driver.findElement(USER_ICON).isDisplayed();
    }

}

