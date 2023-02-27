/*
 * This Class covers 
 * 	All the application specific actions to avoid duplicate code
 * 	Actions that need to be performed on the controls / web elements
 */


package com.jala.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageActions extends PageObjects {



    public PageActions(WebDriver driver) {
        super(driver);
    }

    /**
     * Method is to login to the application
     *
     * @author JALA Academy
     * @param username
     * @param password
     */
    public void logink(String username, String password) {
    }

    /**
     * This JAVA API is to click on a web element
     *
     * @param ele
     * @author JALA Technologies
     */
    public void click(WebElement ele) {
        System.out.println("In click method");
        ele.click();

    }

    /**
     *This method is to type text in the Text Box or Text Area 
     *
     * @param ele
     * @param msg
     */

    public void type(WebElement ele, String msg) {
        System.out.println("In type method");
        ele.clear();
        ele.sendKeys(msg);

    }

    /**
     * This method is to select a value from the drop down.
     *
     * @param ele
     * @param msg
     */

    public void select(WebElement ele, String msg) {
        System.out.println("To select a value from drop down");

       // ToDo

    }

    // Login function
    // Write APIs for repeated actions and call them

}
