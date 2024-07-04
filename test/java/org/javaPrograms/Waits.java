package org.javaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.concurrent.TimeUnit;


public class Waits {
    public static void main(String[] mani) throws InterruptedException {
        System.setProperty("webdriver.chromedriver", "C:\\DRIVERS\\chromedriver_win32\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://salesforce.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        List<WebElement> frames = driver.findElements(By.tagName("iframe"));


        System.out.println(frames.size());
        WebElement shadowElement=driver.findElement(By.id("shadow-root"));
        SearchContext domElement= shadowElement.getShadowRoot();





        }        }
        //driver.switchTo().frame(2);
        //WebElement button = driver.findElement(By.xpath("//img[@class='c360-nav__header-logo-img']"));
        //Actions act = new Actions(driver);
        //act.moveToElement(button).perform();
        //driver.findElement(By.xpath("//button[@type='button']"));


        //Implicitly Wait
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Explicitly Wait
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        /*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-lg btn-ghost-cirrus salesforce-sans-regular   \n" +
                "                     \n" +
                "                    ']")));*/


       // driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("manigane12-htxh@force.com");
        //driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("Lordvj@1210");
        //try {
        //    driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
        //}
        //catch(Exception e){
         //   System.out.println(e);
       //}





