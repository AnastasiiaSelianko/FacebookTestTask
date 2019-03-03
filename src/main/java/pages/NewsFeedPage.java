package pages;

import static page_elements.LoginPageElements.USER_ICON;

public class NewsFeedPage extends BasePage {

    public void openProfile() {
        waitForElement(USER_ICON);
        driver.findElement(USER_ICON).click();
        log.info("Profile page was opened correctly");
    }
}
