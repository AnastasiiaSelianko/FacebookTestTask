package properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import static java.lang.System.getProperty;

public class Prop {

    private Properties prop = new Properties();
    private String userEmail;
    private String userPassword;
    private String webDriverPath;
    private final static String CONFIG_FILE = "src/main/resources/config.properties";
    public Logger log = Logger.getLogger(this.getClass().getSimpleName());

    public Prop() {
        InputStream inputStream;
        try {
            inputStream = new FileInputStream(CONFIG_FILE);
            prop.load(inputStream);

            userEmail = prop.getProperty("user.email");
            userPassword = prop.getProperty("user.password");
            webDriverPath = prop.getProperty("webdriver.path");

        } catch (java.io.IOException e) {
            e.printStackTrace();
            log.info("Configuration file is not found!");
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

    private String getPropValue(String propName) {
        return getProperty(propName, "").isEmpty() ? prop.getProperty(propName) : getProperty(propName);
    }

}