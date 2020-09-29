package com.develwithoutacause;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverDevToolsExtension {
  public static void main(final String[] args) {
    System.setProperty("webdriver.chrome.driver", "tools/chromedriver");
    final var driver = new ChromeDriver(new ChromeOptions()
        .addArguments("--load-extension=extension/")
    );

    driver.get("chrome-extension://jdoodjfonfnbmfgjaecohljglapahego/panel.html");
    final var header = driver.findElement(By.tagName("h2"));
    if (!header.getText().equals("Hello World!")) throw new Error("No header!");

    driver.quit();
  }
}
