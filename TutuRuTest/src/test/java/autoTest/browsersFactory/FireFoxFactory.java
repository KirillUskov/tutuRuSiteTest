package autoTest.browsersFactory;

import autoTest.browserExtensions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Класс, отвечающий за инициализацию создания драйвера для FireFox.
 */

public class FireFoxFactory implements BrowserFactory {

    public FireFoxFactory() {
        WebDriverManager.firefoxdriver().setup();
    }

    @Override
    public WebDriver getBrowserDriver() {
        return WebDriverInitialization.getInstance(new FirefoxDriver(BrowserProperties.getFireFoxSettings()));
    }
}
