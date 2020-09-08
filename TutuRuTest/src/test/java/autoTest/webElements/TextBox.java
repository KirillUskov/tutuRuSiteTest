package autoTest.webElements;

public class TextBox extends BaseWebElement {
    public TextBox(String xPath) {
        super(xPath);
    }

    public void sendText(String text) {
        element.sendKeys(text);
    }
}
