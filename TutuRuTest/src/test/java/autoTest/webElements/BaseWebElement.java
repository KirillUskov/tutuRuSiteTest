package autoTest.webElements;

import autoTest.browserExtensions.WebDriverInitialization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseWebElement {
    private final int WAITING_TIME = 5;
    protected String locator;
    protected WebElement element;
    protected static WebDriver webDriver;

    public BaseWebElement(String xPath) {
        webDriver = WebDriverInitialization.getInstance();
        this.locator = xPath;
    }

    public BaseWebElement(WebElement webElement) {
        webDriver = WebDriverInitialization.getInstance();
        setElement(webElement);
    }

    public static WebElement getElementByTag(String tagName) {
        webDriver = WebDriverInitialization.getInstance();
        return webDriver.findElement(By.tagName(tagName));
    }

    public void setElement(WebElement webElement) {
        element = webElement;
    }

    public void clickElement() {
        findElement();
        element.click();
    }
    public String getElementText() {
        findElement();
        return element.getText();
    }

    public Boolean isElementDisplayed() {
        return element.isDisplayed();
    }

    public void findElement() {
        if (element == null) {
            element = new WebDriverWait(webDriver, WAITING_TIME)
                    .until(webDriver -> webDriver.findElement(By.xpath(locator)));
        }
    }

    public WebElement findChildElement(String xPath) {
        return element.findElement(By.xpath(xPath));
    }
}
