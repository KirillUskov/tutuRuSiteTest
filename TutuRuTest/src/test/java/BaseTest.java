import autoTest.browserExtensions.WebDriverInitialization;
import contants.CommonConstants;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import readerUtils.XMLReader;

public class BaseTest {
    protected String siteUrl;
    protected XMLReader reader;

    @BeforeSuite
    public void setUp() {
        WebDriverInitialization.setBrowser(CommonConstants.CONFIGURATION_FILE_PATH);
        reader = new XMLReader(CommonConstants.CONFIGURATION_FILE_PATH);
        siteUrl = reader.getCustomElement(CommonConstants.SITE_TEXT);
    }

    @AfterSuite
    public void quit() {
        WebDriverInitialization.quitBrowser();
    }

}
