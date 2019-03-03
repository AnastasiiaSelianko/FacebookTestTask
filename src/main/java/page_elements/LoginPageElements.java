package page_elements;

import org.openqa.selenium.By;

public class LoginPageElements {

    public final static By LOGIN_FIELD = By.id("email");
    public final static By PASSWORD_FIELD = By.id("pass");
    public final static By LOGIN_BUTTON = By.id("loginbutton");
    public final static By USER_ICON = By.id("userNav");
    public final static By ABOUT_BUTTON = By.xpath("//a[contains(text(),'About')]");
    public final static By WORK_EDUCATION_SECTION = By.xpath("//a[@class='_5pwr _Interaction__ProfileSectionEducation']");
    public final static By ADD_WORKPLACE_BUTTON = By.xpath("//span[contains(text(),'Add a workplace')]");
    public final static By ADD_SKILLS_BUTTON = By.xpath("//span[@class='_21ok _50f5' and contains(text(),'Add a professional skill')]");
    public final static By ADD_UNIVERSITY_BUTTON = By.xpath("//span[@class='_21ok _50f5' and contains(text(),'Add a college')]");
    public final static By ADD_SCHOOL_BUTTON = By.xpath("//span[@class='_21ok _50f5' and contains(text(),'Add a school')]");
    public final static By SKILL_FIELD = By.xpath("//input[@class='_58al' and @type='text']");
    public final static By EDIT_BUTTON = By.xpath("//a[@class='_4zpz']");
    public final static By REMOVE_BUTTON = By.xpath("//span[@class='_2ei6 _59_o _2ei6']//span//button[@title='Remove'][contains(text(),'Remove')]");
    public final static String SKILL_ADDED_XPATH = "//ul[@class='uiList fbProfileEditExperiences _4kg _4ks']//*[contains(text(),'%s')]";
    public final static By SAVE_BUTTON = By.name("__submit__");

}
