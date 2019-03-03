package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static page_elements.LoginPageElements.*;

public class AboutPage extends BasePage {

    Actions actions = new Actions(driver);

    public void openWorkEducationsection() {
        waitForElement(WORK_EDUCATION_SECTION);
        driver.findElement(WORK_EDUCATION_SECTION).click();
        log.info("Work and Education section was clicked correctly");
    }

    public void addWorkplace() {
        waitForElement(ADD_WORKPLACE_BUTTON);
        driver.findElement(ADD_WORKPLACE_BUTTON).click();
        log.info("Add Workplace button was clicked correctly");
    }

    public void addProfessionalSkills() {
        waitForElement(ADD_SKILLS_BUTTON);
        driver.findElement(ADD_SKILLS_BUTTON).click();
        log.info("Add Professionals skills button was clicked correctly");
    }

    public void addUniversity() {
        waitForElement(ADD_UNIVERSITY_BUTTON);
        driver.findElement(ADD_UNIVERSITY_BUTTON).click();
        log.info("Add University button was clicked correctly");
    }

    public void addSchool() {
        waitForElement(ADD_SCHOOL_BUTTON);
        driver.findElement(ADD_SCHOOL_BUTTON).click();
        log.info("Add School button was clicked correctly");
    }

    public void setSkill(String skill) throws Exception {
        waitForElement(SKILL_FIELD);
        actions.moveToElement(driver.findElement(SKILL_FIELD));
        driver.findElement(SKILL_FIELD).click();
        driver.findElement(SKILL_FIELD).clear();
        driver.findElement(SKILL_FIELD).sendKeys(skill);
        Thread.sleep(2000); // it needs to appearance drop down list
        driver.findElement(SKILL_FIELD).sendKeys(Keys.ENTER);
        log.info("Skill was inputted correctly");
    }

    public void clickOnSaveButton() {
        actions.moveToElement(driver.findElement(SAVE_BUTTON));
        driver.findElement(SAVE_BUTTON).click();
        log.info("Save button was clicked correctly");
    }

    public boolean isProfessionalSkillAdded(String skill) {
        return driver.findElement(By.xpath(String.format(SKILL_ADDED_XPATH, skill))).isDisplayed();
    }

    public void clickOnEditButton(String skill) {
        actions.moveToElement(driver.findElement(By.xpath(String.format(SKILL_ADDED_XPATH, skill)))).build().perform();
        waitForElement(EDIT_BUTTON);
        driver.findElement(EDIT_BUTTON).click();
        log.info("Edit button was clicked correctly");
    }

    public void clickOnRemoveButton() {
        waitForElement(REMOVE_BUTTON);
        driver.findElement(REMOVE_BUTTON).click();
        log.info("Remove button was clicked correctly");
    }
}
