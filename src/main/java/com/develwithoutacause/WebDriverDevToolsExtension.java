package com.develwithoutacause;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverDevToolsExtension {
  public static void main(final String[] args) {
    System.setProperty("webdriver.chrome.driver", "tools/chromedriver");
    final var driver = new ChromeDriver(new ChromeOptions()
        .setHeadless(true)
    );
    driver.get("https://www.google.com/");
    final var element = driver.findElement(By.tagName("body"));
    if (element == null) throw new Error("No <body /> tag!");
    System.out.println(element);
    driver.quit();
  }
}
