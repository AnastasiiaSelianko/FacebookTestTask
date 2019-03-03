package stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.LoginPage;
import properties.Prop;

public class ServiceHooks {

    private LoginPage loginPage = new LoginPage();
    private Prop prop = new Prop();
    private String userEmail = prop.getUserEmail();
    private String userPassword = prop.getUserPassword();

    public ServiceHooks() {
    }

    @Before
    public void initializeTest() {
        loginPage.loginFacebook(userEmail, userPassword);
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                loginPage.closeBrowser();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        loginPage.closeBrowser();
    }
}