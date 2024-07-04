package org.javaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class ExplicitWaitMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver", "C:\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        driver.getWindowHandles();

        //Implicitly Wait
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //Explicit Wait
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='input']")));

        JavascriptExecutor jse= (JavascriptExecutor)driver;
        WebElement button= (WebElement)jse.executeScript("return document.querySelector('ntp-app').shadowRoot.querySelector('ntp-realbox').shadowRoot.querySelector('input')");
        ((JavascriptExecutor)driver).executeScript("arguments[0].click",button);
        //driver.findElement(By.xpath("//input[@id='input']")).click();

        Wait<WebDriver> Flwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2
        )).ignoring(NoSuchElementException.class);

        WebElement foo=Flwait.until(new Function<WebDriver,WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.xpath(""));

            }
        });


    }
}
