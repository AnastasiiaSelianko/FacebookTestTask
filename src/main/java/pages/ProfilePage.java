package pages;

import static page_elements.LoginPageElements.ABOUT_BUTTON;

public class ProfilePage extends BasePage {

    public void openAboutTab() {
        waitForElement(ABOUT_BUTTON);
        driver.findElement(ABOUT_BUTTON).click();
        log.info("About button was clicked correctly");
    }

}
