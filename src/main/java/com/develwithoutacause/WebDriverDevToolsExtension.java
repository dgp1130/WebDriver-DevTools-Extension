package com.develwithoutacause;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverDevToolsExtension {
  public static void main(final String[] args) {
    System.setProperty("webdriver.chrome.driver", "tools/chromedriver");
    final var driver = new ChromeDriver(new ChromeOptions()
        .addArguments("--load-extension=extension/")
        .addArguments("--auto-open-devtools-for-tabs")
    );

    // Seems like this is a "Chrome DevTools Protocol" session, not the "DevTools" UI.
    driver.getDevTools().createSession();

    driver.quit();
  }
}
