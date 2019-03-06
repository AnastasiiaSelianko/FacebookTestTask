package page_elements;

import org.openqa.selenium.By;

public class LoginPageElements {

    public static final String ADD_BUTTON_XPATH_TEMPLATE = "//div[@id='pagelet_edit_eduwork']//div[%s]//li";
    public static final By LOGIN_FIELD = By.id("email");
    public static final By PASSWORD_FIELD = By.id("pass");
    public static final By LOGIN_BUTTON = By.id("loginbutton");
    public static final By USER_ICON = By.id("userNav");
    public static final By NAV_LABEL = By.id("userNavigationLabel");
    public static final By LOGOUT_BUTTON = By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']//a[@class='_54nc']");
    public static final By ABOUT_BUTTON = By.xpath("//a[@class='_6-6' and @data-tab-key='about']");
    public static final By WORK_EDUCATION_SECTION = By.xpath("//a[@data-testid='nav_edu_work']");
    public static final By ADD_SKILLS_BUTTON = By.xpath(String.format(ADD_BUTTON_XPATH_TEMPLATE, 2));
    public static final By SKILL_FIELD = By.xpath("//input[@class='_58al' and @type='text']");
    public static final By EDIT_BUTTON = By.xpath("//a[@class='_4zpz']");
    public static final By REMOVE_BUTTON = By.xpath(String.format(ADD_BUTTON_XPATH_TEMPLATE, 2) + "//button[@class='_1z6_ _50zy _50zz _50z- _5upp _42ft']");
    public static final By SAVE_BUTTON = By.name("__submit__");
    public static final By SKILL_ADDED = By.xpath(String.format(ADD_BUTTON_XPATH_TEMPLATE, 2) + "//div[@class='_59_m']//span[@class='_5aab']");


}
