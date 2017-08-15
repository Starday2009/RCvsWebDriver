package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteWebDriverFactory {

    public static WebDriver createInstance(String browserName) {
        URL hostURL = null;
        try {
            hostURL = new URL("http://127.0.0.1:6666/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        DesiredCapabilities capability = null;

        if (browserName.toLowerCase().contains("firefox")) {
            capability = DesiredCapabilities.firefox();
            capability.setBrowserName("firefox");
        }
        if (browserName.toLowerCase().contains("internet")) {
            capability = DesiredCapabilities.internetExplorer();
        }
        if (browserName.toLowerCase().contains("chrome")) {
            capability = DesiredCapabilities.chrome();
            capability.setBrowserName("chrome");
        }

        WebDriver driver = new RemoteWebDriver(hostURL, capability);
//       Если захотите локально один браузер запустить
//        WebDriver driver = new FirefoxDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Windows\\geckodriver.exe");
        driver.manage().window().maximize();
        return driver;
    }
}