package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static page_elements.LoginPageElements.*;

public class AboutPage extends BasePage {

    private Actions actions = new Actions(driver);

    public void openWorkEducationSection() {
        waitForElement(WORK_EDUCATION_SECTION);
        driver.findElement(WORK_EDUCATION_SECTION).click();
        LOG.info("Work and Education section was clicked correctly");
    }

    public void addProfessionalSkills() {
        waitForElement(ADD_SKILLS_BUTTON);
        driver.findElement(ADD_SKILLS_BUTTON).click();
        LOG.info("Add Professionals skills button was clicked correctly");
    }

    public void setSkill(String skill) throws Exception {
        waitForElement(SKILL_FIELD);
        actions.moveToElement(driver.findElement(SKILL_FIELD));
        driver.findElement(SKILL_FIELD).click();
        driver.findElement(SKILL_FIELD).clear();
        driver.findElement(SKILL_FIELD).sendKeys(skill);
        Thread.sleep(2000); // it needs to appearance drop down list
        driver.findElement(SKILL_FIELD).sendKeys(Keys.ENTER);

        LOG.info("Skill was inputted correctly");
    }

    public void clickOnSaveButton() {
        actions.moveToElement(driver.findElement(SAVE_BUTTON));
        driver.findElement(SAVE_BUTTON).click();
        LOG.info("Save button was clicked correctly");
    }

    public boolean isProfessionalSkillAdded() {
        return driver.findElement(SKILL_ADDED).isDisplayed();
    }

    public String getProfSkillName() {
        return driver.findElement(SKILL_ADDED).getText();
    }

    public void clickOnEditButton(String skill) {
        actions.moveToElement(driver.findElement(SKILL_ADDED)).build().perform();
        waitForElement(EDIT_BUTTON);
        driver.findElement(EDIT_BUTTON).click();
        LOG.info("Edit button was clicked correctly");
    }

    public void clickOnRemoveButton() {
        waitForElement(REMOVE_BUTTON);
        driver.findElement(REMOVE_BUTTON).click();
        LOG.info("Remove button was clicked correctly");
    }

}
