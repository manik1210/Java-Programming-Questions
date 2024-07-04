package com.Framework.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;

public class ExtentReporterNG {
    static ExtentReports extent = new ExtentReports();

    @BeforeTest
    public static ExtentReports config() {
        // ExtentReports & ExtentSparkReporter
        String path = System.getProperty("user.dir") + "\\reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Results");
        reporter.config().setDocumentTitle("Test results");

        // ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Test Analyst", "Manikandan");
        //extent.createTest(path);
        return extent;
    }

}
