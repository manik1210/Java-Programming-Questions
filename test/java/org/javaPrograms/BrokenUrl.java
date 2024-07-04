package org.javaPrograms;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenUrl extends BaseTest {



    @Test (priority = 0)
    public void verifyTitle(){

        driver.get("https://amazon.in");
        String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Test (priority = 0)
    public void capture(){

        driver.get("https://amazon.in");

        TakesScreenshot ts=(TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String Destination = "C:\\Users\\manik\\OneDrive - Microsoft 365\\Documents\\Screenshots.png";
        System.out.println(Destination);
        try {
            // Save the screenshot to the destination path
            org.apache.commons.io.FileUtils.copyFile(source, new File(Destination));
            System.out.println("Screenshot saved to: " + Destination);
        } catch (IOException e) {
            System.out.println("Failed to save the screenshot: " + e.getMessage());
        }
    }
    @Test (priority=1)
    public void identifyBrokenUrlinAmaozon(){

        driver.get("https://amazon.in");
        List<WebElement> urls= driver.findElements(By.tagName("a"));
        List<String> brokenurls= new ArrayList<>();

        System.out.println("URL Size :"+urls.size());
        urls.parallelStream().forEach(link->{
            String url =link.getAttribute("href");
            if(url!=null && !url.isEmpty()){
                    try {
                        HttpURLConnection connection=(HttpURLConnection) new URL(url).openConnection();
                        connection.setRequestMethod("HEAD");
                        connection.connect();

                        int responseCode=connection.getResponseCode();

                        if(responseCode>=400){
                            System.out.println("Broken URL : "+ url);
                            brokenurls.add(url);
                        }
                    } catch (IOException e) {
                        System.out.println("Error Connecting to the URL :"+url);
                    }
                }
            }
        );

        System.out.println("Number of broken URLs :"+brokenurls.size());


    }

    @Test (priority =2)
    public void identifyBrokenUrlinSalesforce(){

        driver.get("https://salesforce.com");
        List<WebElement> urls= driver.findElements(By.tagName("a"));
        List<String> brokenurls= new ArrayList<>();

        System.out.println("URL Size :"+urls.size());
        urls.parallelStream().forEach(link->{
                    String url =link.getAttribute("href");
                    if(url!=null && !url.isEmpty()){
                        try {
                            HttpURLConnection connection=(HttpURLConnection) new URL(url).openConnection();
                            connection.setRequestMethod("HEAD");
                            connection.connect();

                            int responseCode=connection.getResponseCode();

                            if(responseCode>=400){
                                System.out.println("Broken URL : "+ url);
                                brokenurls.add(url);
                            }
                        } catch (IOException e) {
                            System.out.println("Error Connecting to the URL :"+url);
                        }
                    }
                }
        );

        System.out.println("Number of broken URLs :"+brokenurls.size());


    }
}
