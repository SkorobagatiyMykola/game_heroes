package com.skorobagatiy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {
    private static WebDriver webDriver;
    private static String URL ="https://www.heroeswm.ru/";


    private static String login ="Norwagia";
    private static String pass ="Nick_1805";

    static {
        WebDriverManager.firefoxdriver().setup();
    }
    public static void main(String[] args) {
        setUp();

        try {
            webDriver.get(URL);

            // WebElement userField = webDriver.findElement(By.xpath("//input[@class=\"form-field-input\"]"));
            // WebElement button = webDriver.findElement(By.xpath("//button[@class=\"btn btn-red\"]"));
            WebElement userLogin = webDriver.findElement(By.xpath("//input[@class=\"login\"]"));
            WebElement userPass = webDriver.findElement(By.xpath("//input[@class=\"pass\"]"));
            WebElement button = webDriver.findElement(By.xpath("//input[@class=\"entergame\"]"));

            userLogin.sendKeys(login);
            userPass.sendKeys(pass);

            System.out.println("256516");

            button.click();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static void setUp() {

        try {
            webDriver = buildFirefoxWebDriver();
        } catch (Exception e) {
          //  logger.error("Failed to start the browser: " + e.getMessage());
            throw e;
        }

//        int timeout = timeoutInSecondsProvider.get();
//        // https://www.seleniumhq.org/docs/04_webdriver_advanced.jsp#implicit-waits
//        webDriver.manage().timeouts().implicitlyWait(timeout, SECONDS);
//        // https://www.seleniumhq.org/docs/04_webdriver_advanced.jsp#explicit-waits
//        wait = new WebDriverWait(webDriver, timeout);
    }
    private static WebDriver buildFirefoxWebDriver() {

        FirefoxOptions options = new FirefoxOptions();
                //.setHeadless(false);

        return new FirefoxDriver(options);
    }
}