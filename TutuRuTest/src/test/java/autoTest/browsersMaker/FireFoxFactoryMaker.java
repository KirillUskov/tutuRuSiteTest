package autoTest.browsersMaker;

import autoTest.browsersFactory.BrowserFactory;
import autoTest.browsersFactory.FireFoxFactory;

/**
 * The class is responsible for initializing the FireFoxFactory
 */

public class FireFoxFactoryMaker implements BrowserMaker {

    @Override
    public BrowserFactory createBrowser() {
        return new FireFoxFactory();
    }
}
