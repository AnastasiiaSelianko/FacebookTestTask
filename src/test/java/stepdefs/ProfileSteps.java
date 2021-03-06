package stepdefs;

import cucumber.api.java.en.*;
import org.testng.Assert;
import pages.AboutPage;
import pages.NewsFeedPage;
import pages.ProfilePage;

public class ProfileSteps {

    private AboutPage aboutPage = new AboutPage();
    private NewsFeedPage newsfeedPage = new NewsFeedPage();
    private ProfilePage profilePage = new ProfilePage();

    @Given("^Switch to Profile page as existing User.$")
    public void switchToProfile() {
        newsfeedPage.openProfile();
    }

    @And("^About tab is opened.$")
    public void aboutTabIsOpened() {
        profilePage.openAboutTab();
    }

    @And("^Work and Education section is opened.$")
    public void workAndEducationSectionIsOpened() {
        aboutPage.openWorkEducationSection();
    }


    @And("^Add a Professional Skill section is opened.$")
    public void addAProfessionalSkillSectionIsOpened() {
        aboutPage.addProfessionalSkills();
    }


    @When("^User set (.*) to skills field.$")
    public void userSetSkillToSkillsField(String skill) throws Exception {
        aboutPage.setSkill(skill);
    }

    @And("^User click on Save changes.$")
    public void userClickOnSaveChanges() {
        aboutPage.clickOnSaveButton();
    }

    @Then("^Professional (.*) successfully added.$")
    public void professionalSkillsSuccessfullyAdded(String skill) {
        Assert.assertTrue(aboutPage.isProfessionalSkillAdded());
        Assert.assertEquals(aboutPage.getProfSkillName().toLowerCase(), skill.toLowerCase());

    }

    @But("^Delete (.*) after test.$")
    public void deleteChangesAfterTest(String skill) {
        aboutPage.clickOnEditButton(skill);
        aboutPage.clickOnRemoveButton();
        aboutPage.clickOnSaveButton();
    }

}
