package autoTest.browsersFactory;

import autoTest.browserExtensions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Класс, отвечающий за инициализацию создания драйвера для Chrome.
 */

public class ChromeFactory implements BrowserFactory {

    public ChromeFactory() {
        WebDriverManager.chromedriver().setup();
    }

    @Override
    public WebDriver getBrowserDriver() {
        WebDriver driver = new ChromeDriver(BrowserProperties.getChromeSettings());
        return WebDriverInitialization.getInstance(driver);
    }

}
