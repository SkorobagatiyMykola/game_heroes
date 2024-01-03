package com.skorobagatiy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Main {
    private static String URL ="https://www.heroeswm.ru/";

    private WebDriver webDriver;
    private static String login ="Norwagia";
    private static String pass ="Nick_1805";
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//        //System.setProperty("webdriver.chrome.driver", "path of driver");
//        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
//
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get(URL);
//        // <input name="login" type="text" maxlength="18" class="inp_login" title="Логин в игре" value="Имя персонажа" onfocus="clearLogin();">
//
//        WebElement username=driver.findElement(By.id("login"));
//        WebElement password=driver.findElement(By.id("pass"));
//
//        username.sendKeys(login);
//        password.sendKeys(pass);
//
//        // /html/body/form/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr/td/div/input
//        WebElement btn=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr/td/div/input"));
//        // <input type="image" src="https://dcdn1.heroeswm.ru/i/index2012/enter0.jpg" title="Войти в игру!">
//        //WebElement login=driver.findElement(By.name("commit"));
//
//        btn.click();

    }

    private WebDriver buildFirefoxWebDriver() {

//        FirefoxOptions options = new FirefoxOptions()
//                .setHeadless(true);

        return new FirefoxDriver(options);
    }
}