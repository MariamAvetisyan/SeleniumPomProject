package orgname.ft.setup;

import java.io.FileInputStream;
import java.util.Properties;

public class Configurations {
    public static final String LOGIN_URL;
    public static final String USERNAME;
    public static final String PASSWORD;
    static {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/configuration.properties")) {
            properties.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGIN_URL = properties.getProperty("url");
        USERNAME = properties.getProperty("username");
        PASSWORD = properties.getProperty("password");
    }
}
