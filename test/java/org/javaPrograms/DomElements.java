package org.javaPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chromedriver","C:\\DRIVERS\\chromedriver_win32\\chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://salesforce.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        WebElement loginButton= (WebElement) jse.executeScript("return document.querySelector('body > div.globalnav-wrapper-c360 > hgf-c360nav').shadowRoot.querySelector('header > div > div.c360-nav__wrapper > nav.utility-nav.show > ul > li.utility-icons-items.login > hgf-c360login').shadowRoot.querySelector('hgf-popover > hgf-button').shadowRoot.querySelector('button')");

        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",loginButton);

    }
}
