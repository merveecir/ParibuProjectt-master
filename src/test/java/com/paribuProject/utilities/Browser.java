package com.paribuProject.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {
    private Browser() {

    }

    private static WebDriver browser;

    public static WebDriver get() {
        if (browser == null) {
            String browser = PropertiesReader.get("browser");
            switch (browser) {
                case "chrome":
                    Browser.browser = new ChromeDriver();
                    break;
                case "chrome-headless":
                    Browser.browser = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
                    break;
                case "firefox":
                    Browser.browser = new FirefoxDriver();
                    break;
                case "edge":
                    Browser.browser = new EdgeDriver();
                    break;
                case "safari":
                    Browser.browser = new SafariDriver();
                    break;
            }
        }
        return browser;
    }

    public static void killBrowser() {
        if (browser != null) {
            browser.quit();
            browser = null;
        }
    }
}