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
    private String browser = prop.getBrowser();

   /* public ServiceHooks() {
    }*/

    @Before
    public void initializeTest() {
        loginPage.setUpTest(browser);
        loginPage.loginFacebook(userEmail, userPassword);
    }

    @After
    public void embedScreenShot(Scenario scenario) {
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