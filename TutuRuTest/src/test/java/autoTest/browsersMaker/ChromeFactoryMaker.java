package autoTest.browsersMaker;

import autoTest.browsersFactory.BrowserFactory;
import autoTest.browsersFactory.ChromeFactory;

/**
 * The class is responsible for initializing the ChromeFactory
 */

public class ChromeFactoryMaker implements BrowserMaker {

    @Override
    public BrowserFactory createBrowser() {
        return new ChromeFactory();
    }

}
