package com.jala.selenium.framework;

import com.jala.selenium.pageobjects.PageActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


// This is BaseTest Class. This class will be extended to every testsuite classes

public class BaseTest {

    protected WebDriver driver;
    protected   PageActions pageObj;



    public static String URL = "http://magnus.jalatechnologies.com/";

    /**
     * Object of location of webdriver
     */
    // public static String driverPath = "\"C:\\Users\\Asus\\Downloads\\chromedriver_win32\\chromedriver.exe\"";
    protected Logger  log = Logger.getLogger("devpinoyLogger");



    /**
     * @throws Exception
     */

    @Test
    public void setUp() {
        System.out.println("Before Method ");

        try {
            System.out.println("launching chrome browser");

            // Set driver path
            System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();

            // Launching the application
            driver.get(URL);
            System.out.println("Application launched successfully");

            // Page Object initilization
            pageObj = new PageActions(driver);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
