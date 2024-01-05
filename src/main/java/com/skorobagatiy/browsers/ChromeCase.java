package com.skorobagatiy.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class ChromeCase {
    private static String URL = "https://www.heroeswm.ru/";
    private static String obj_URL = "https://www.heroeswm.ru/object-info.php?id=312";

    private static String login = "Norwagia";
    private static String pass = "Nick_1805";

    public static void main(String[] args) throws InterruptedException {

            WebDriver webDriver = new ChromeDriver();

            webDriver.get(URL);
            webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

            WebElement userLogin = webDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[2]/td[2]/input[1]"));
            WebElement userPass = webDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[4]/td[2]/input[1]"));
            WebElement button = webDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr/td/div/input"));

            userLogin.sendKeys(login);
            userPass.sendKeys(pass);
            button.click();

            WebElement gold = webDriver.findElement(By.xpath("//*[@id=\"top_res_table\"]/tbody/tr/td[2]"));
            System.out.println("Now I have the gold: " + gold.getText());

            webDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(60));


            webDriver.get(obj_URL);
            WebElement buttonObj = webDriver.findElement(By.xpath("//*[@id=\"wbtn\"]"));
            buttonObj.click();
            webDriver.quit();

    }
}
