package page_elements;

import org.openqa.selenium.By;

public class LoginPageElements {

    public static final By LOGIN_FIELD = By.id("email");
    public static final By PASSWORD_FIELD = By.id("pass");
    public static final By LOGIN_BUTTON = By.id("loginbutton");
    public static final By USER_ICON = By.id("userNav");
    public static final By NAV_LABEL = By.id("userNavigationLabel");
    public static final By LOGOUT_BUTTON = By.xpath("//span[contains(text(),'Log Out')]");
    public static final By ABOUT_BUTTON = By.xpath("//a[contains(text(),'About')]");
    public static final By WORK_EDUCATION_SECTION = By.xpath("//a[@class='_5pwr _Interaction__ProfileSectionEducation']");
    public static final By ADD_WORKPLACE_BUTTON = By.xpath("//span[contains(text(),'Add a workplace')]");
    public static final By ADD_SKILLS_BUTTON = By.xpath("//span[@class='_21ok _50f5' and contains(text()," +
            "'Add a professional skill')]");
    public static final By ADD_UNIVERSITY_BUTTON = By.xpath("//span[@class='_21ok _50f5' and contains(text()," +
            "'Add a college')]");
    public static final By ADD_SCHOOL_BUTTON = By.xpath("//span[@class='_21ok _50f5' and contains(text()," +
            "'Add a school')]");
    public static final By SKILL_FIELD = By.xpath("//input[@class='_58al' and @type='text']");
    public static final By EDIT_BUTTON = By.xpath("//a[@class='_4zpz']");
    public static final By REMOVE_BUTTON = By.xpath("//span[@class='_2ei6 _59_o _2ei6']//span//button" +
            "[@title='Remove'][contains(text(),'Remove')]");
    public static final By SAVE_BUTTON = By.name("__submit__");
    public static final String SKILL_ADDED_XPATH = "//ul[@class='uiList fbProfileEditExperiences _4kg _4ks']" +
            "//*[contains(text(),'%s')]";

}
