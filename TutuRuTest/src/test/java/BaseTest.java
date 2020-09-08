import autoTest.browserExtensions.WebDriverInitialization;
import contants.CommonConstants;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setUp() {
        WebDriverInitialization.setBrowser(CommonConstants.CONFIGURATION_FILE_PATH);
    }

    @AfterSuite
    public void quit() {
        WebDriverInitialization.quitBrowser();
    }

}
