package org.javaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class BrokenURLProgram {

    @Test
    public void testUrlsBroken(){

        System.setProperty("webdriver.chromedriver","C:\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.in");
        driver.manage().window().maximize();
        AtomicInteger brokenUrlCount= new AtomicInteger();
        List<WebElement> urls= driver.findElements(By.tagName("a"));
        System.out.println(urls.size());
        List<String> brokenUrls= new ArrayList<>();
        urls.parallelStream().forEach(link-> {
            String url=link.getAttribute("href");
            if(url!=null && !url.isEmpty()){
                try {
                    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.connect();

                    int responseCode = connection.getResponseCode();
                    if (responseCode >= 400) {
                        System.out.println("Broken URL: "+ responseCode);
                        brokenUrls.add(url);
                        brokenUrlCount.getAndIncrement();



                    }
                } catch (IOException e) {
                    System.out.println(e);
                }

            }
        });
        System.out.println(brokenUrlCount);
        System.out.println(brokenUrls);
    }}

