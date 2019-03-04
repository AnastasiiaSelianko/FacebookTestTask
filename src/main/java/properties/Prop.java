package properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Prop {

    private static final String CONFIG_FILE = "src/main/resources/config.properties";
    private String userEmail;
    private String userPassword;
    private String webDriverPath;
    private String browser;

    public Prop() {
         InputStream inputStream;
        try {
            inputStream = new FileInputStream(CONFIG_FILE);
            Properties prop = new Properties();
            prop.load(inputStream);

            userEmail = prop.getProperty("user.email");
            userPassword = prop.getProperty("user.password");
            webDriverPath = prop.getProperty("webdriver.path");
            browser = prop.getProperty("browser");
        } catch (java.io.IOException e) {
            e.printStackTrace();

        }
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getWebDriverPath() {
        return webDriverPath;
    }

    public String getBrowser() {
        return browser;
    }

}