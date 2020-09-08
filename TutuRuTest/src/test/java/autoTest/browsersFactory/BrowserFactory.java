package autoTest.browsersFactory;

import org.openqa.selenium.WebDriver;

/**
 * Интерфейс, задающий базовый функционал классов по инициализации
 * создания веб-драйвера.
 */

public interface BrowserFactory {
   WebDriver getBrowserDriver();
}


