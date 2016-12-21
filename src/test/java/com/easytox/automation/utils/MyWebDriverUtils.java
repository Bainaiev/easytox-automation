package com.easytox.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Alexander on 12.12.2016.
 */
public class MyWebDriverUtils {

    private static final int TIME_OUT_IN_SECONDS = 10;
    private static final String CONTAINER_LOCATOR = "loadingDiv";

    private static final String CELL_LOCATOR = "td";
    private static final String ROWS_LOCATOR = "tr";

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

    public static WebElement findElement(WebDriver driver, final String locator, LocatorType locatorType, final WebElement el) {
        switch (locatorType) {
            case XPATH:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver input) {
                        return el.findElement(By.xpath(locator));
                    }
                });
            case CLASS:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver input) {
                        return el.findElement(By.className(locator));
                    }
                });
            case ID:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver input) {
                        return el.findElement(By.id(locator));
                    }
                });
            case TAG:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver input) {
                        return el.findElement(By.tagName(locator));
                    }
                });
            case NAME:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver input) {
                        return el.findElement(By.name(locator));
                    }
                });
            case CSS:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver input) {
                        return el.findElement(By.cssSelector(locator));
                    }
                });
        }
        return null;
    }

    public static WebElement findPresenceElement(WebDriver driver, final String locator, LocatorType locatorType) {

        final WebDriverWait webDriverWait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);

        switch (locatorType) {
            case XPATH:
                return webDriverWait
                        .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            case CLASS:
                return webDriverWait
                        .until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));
            case ID:
                return webDriverWait
                        .until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
            case TAG:
                return webDriverWait
                        .until(ExpectedConditions.presenceOfElementLocated(By.tagName(locator)));
            case NAME:
                return webDriverWait
                        .until(ExpectedConditions.presenceOfElementLocated(By.name(locator)));
            case CSS:
                return webDriverWait
                        .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));

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

    public static List<WebElement> findElements(final WebDriver driver, final String locator, LocatorType locatorType) {
        switch (locatorType) {
            case XPATH:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver input) {
                        return driver.findElements(By.xpath(locator));
                    }
                });
            case CLASS:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver input) {
                        return driver.findElements(By.className(locator));
                    }
                });
            case ID:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver input) {
                        return driver.findElements(By.id(locator));
                    }
                });
            case TAG:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver input) {
                        return driver.findElements(By.tagName(locator));
                    }
                });
            case NAME:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver input) {
                        return driver.findElements(By.name(locator));
                    }
                });
            case CSS:
                return (new WebDriverWait(driver, TIME_OUT_IN_SECONDS)).until(new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver input) {
                        return driver.findElements(By.cssSelector(locator));
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

    public static void waitContainerThenClick(WebDriver driver, String locator, LocatorType type) {
        WebElement element = MyWebDriverUtils.findElement(driver, locator, type);
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);

        boolean flag = waitInvisibilityOfElement(wait, CONTAINER_LOCATOR, LocatorType.ID);
        if (flag) {
            if (element != null) {
                element.click();
            } else {
                Assert.fail("element is null!");
            }
        } else {
            Assert.fail("flag is false!");
        }
    }

    public static void click(WebDriver driver, String locator, LocatorType type) {
        WebElement element = findElement(driver, locator, type);
        if (element != null) {
            element.click();
        } else {
            Assert.fail("element is null");
        }
    }

    public static void enterData(WebDriver driver, String locator, LocatorType type, String value) {
        WebElement element = findPresenceElement(driver, locator, type);
        if (element != null) {
            element.clear();
            element.sendKeys(value);
        } else {
            Assert.fail("element is null!");
        }
    }

    public static void authorization(WebDriver driver, String url,
                                     String userLocator, LocatorType userType, String userName,
                                     String passLocator, LocatorType passType, String password,
                                     String buttonLocator, LocatorType buttonType) {
        driver.navigate().to(url);
        enterData(driver, userLocator, userType, userName);
        enterData(driver, passLocator, passType, password);
        click(driver, buttonLocator, buttonType);
    }

    public static void checkCurrentUrl(WebDriver driver, String url) {
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    public static void checkWidgetCaption(WebDriver driver, String widgetLocator, LocatorType type, String widgetValue) {
        WebElement element = findPresenceElement(driver, widgetLocator, type);
        if (element != null) {
            String title = element.getText();
            Assert.assertEquals(title, widgetValue);
        } else {
            Assert.fail("element is null!");
        }
    }

    public static void selectOption(WebDriver driver, String locator, LocatorType type, String option) {
        WebElement element = findElement(driver, locator, type);
        if (element != null) {
            new Select(element).selectByVisibleText(option);
        } else {
            Assert.fail("element is null");
        }
    }

    public static List<WebElement> getCells(WebDriver driver, String tableLocator, LocatorType type, int rowNum, int cellsSize) {
        final WebElement table = MyWebDriverUtils.findElement(driver, tableLocator, type);
        if (table != null) {
            List<WebElement> listRows = MyWebDriverUtils.findElements(driver, ROWS_LOCATOR, LocatorType.TAG, table);
            if (listRows != null) {
                int size = listRows.size();
                if(rowNum >= size){
                    return null;
                }
                List<WebElement> listCells = MyWebDriverUtils.findElements(driver, CELL_LOCATOR, LocatorType.TAG, listRows.get(rowNum));

                if (listCells != null && listCells.size() == cellsSize) {
                    return listCells;
                } else {
                    throw new StaleElementReferenceException("listCells size is not equal " + cellsSize);
                }
            } else {
                Assert.fail("listRows is null!");
            }
        } else {
            Assert.fail("table is null!");
        }
        return null;
    }


    public static int getRowsSize(WebDriver driver, String tableLocator, LocatorType type) {
        final WebElement table = MyWebDriverUtils.findElement(driver, tableLocator, type);
        if (table != null) {
            List<WebElement> listRows = MyWebDriverUtils.findElements(driver, ROWS_LOCATOR, LocatorType.TAG, table);
            if (listRows != null) {
                return listRows.size() - 1;
            } else {
                Assert.fail("listRows is null!");
            }
        }
        return 0;
    }




}
