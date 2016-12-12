package com.easytox.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Alexander on 12.12.2016.
 */
public class MyWebDriverUtils {

    private static final int TIME_OUT_IN_SECONDS = 10;

    public static WebElement findElement(WebDriver driver, final String locator, LocatorType locatorType) {

        final WebDriverWait webDriverWait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);

        switch (locatorType) {
            case XPATH:
                return webDriverWait
                        .until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
            case CLASS:
                return webDriverWait
                        .until(ExpectedConditions.elementToBeClickable(By.className(locator)));
            case ID:
                return webDriverWait
                        .until(ExpectedConditions.elementToBeClickable(By.id(locator)));
            case TAG:
                return webDriverWait
                        .until(ExpectedConditions.elementToBeClickable(By.tagName(locator)));
            case NAME:
                return webDriverWait
                        .until(ExpectedConditions.elementToBeClickable(By.name(locator)));
            case CSS:
                return webDriverWait
                        .until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));

        }
        return null;
    }

    public static WebElement findElement(WebDriver driver, int timeOutInSeconds, final String locator, LocatorType locatorType, final WebElement el) {
        switch (locatorType) {
            case XPATH:
                return (new WebDriverWait(driver, timeOutInSeconds)).until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver input) {
                        return el.findElement(By.xpath(locator));
                    }
                });
            case CLASS:
                return (new WebDriverWait(driver, timeOutInSeconds)).until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver input) {
                        return el.findElement(By.className(locator));
                    }
                });
            case ID:
                return (new WebDriverWait(driver, timeOutInSeconds)).until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver input) {
                        return el.findElement(By.id(locator));
                    }
                });
            case TAG:
                return (new WebDriverWait(driver, timeOutInSeconds)).until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver input) {
                        return el.findElement(By.tagName(locator));
                    }
                });
            case NAME:
                return (new WebDriverWait(driver, timeOutInSeconds)).until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver input) {
                        return el.findElement(By.name(locator));
                    }
                });
            case CSS:
                return (new WebDriverWait(driver, timeOutInSeconds)).until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver input) {
                        return el.findElement(By.cssSelector(locator));
                    }
                });
        }
        return null;
    }

    public static List<WebElement> findElements(WebDriver driver, final String locator, LocatorType locatorType, final WebElement el) {
        switch (locatorType) {
            case XPATH:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver input) {
                        return el.findElements(By.xpath(locator));
                    }
                });
            case CLASS:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver input) {
                        return el.findElements(By.className(locator));
                    }
                });
            case ID:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver input) {
                        return el.findElements(By.id(locator));
                    }
                });
            case TAG:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver input) {
                        return el.findElements(By.tagName(locator));
                    }
                });
            case NAME:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver input) {
                        return el.findElements(By.name(locator));
                    }
                });
            case CSS:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver input) {
                        return el.findElements(By.cssSelector(locator));
                    }
                });
        }
        return null;
    }

    public static boolean waitInvisibilityOfElement(WebDriverWait wait, String locator, LocatorType type) {
        switch (type) {
            case XPATH:
                return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
            case CLASS:
                return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(locator)));
            case ID:
                return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(locator)));
            case TAG:
                return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName(locator)));
            case NAME:
                return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(locator)));
            case CSS:
                return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locator)));
        }
        return false;
    }
}
