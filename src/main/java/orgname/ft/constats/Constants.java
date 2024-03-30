package orgname.ft.constats;

import java.io.FileInputStream;
import java.nio.file.Paths;
import java.util.Properties;

public class Constants {
//    public static final String LOGIN_URL;
//    public static final String USERNAME;
//    public static final String PASSWORD;
    //public static final String IMAGE_PATH = "src/main/resources/image.jpg";
    public static final String IMAGE_PATH = String.valueOf(Paths.get("src/main/resources/image.jpg").toAbsolutePath());


//    static {
//        Properties properties = new Properties();
//        try (FileInputStream fis = new FileInputStream("src/main/resources/configuration.properties")) {
//            properties.load(fis);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        LOGIN_URL = properties.getProperty("url");
//        USERNAME = properties.getProperty("username");
//        PASSWORD = properties.getProperty("password");
//    }
}
