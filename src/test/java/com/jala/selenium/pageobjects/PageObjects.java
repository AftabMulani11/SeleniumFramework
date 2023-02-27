/*
 * This Class covers 
 * 		all the objects page wise
 * Note: if application is complex, 
 * need to have a separate java file for objects of each page to maintain easily in collobaration. 
 * 	
 */

package com.jala.selenium.pageobjects;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

    public WebDriver driver;
    Logger log = Logger.getLogger("devpinoyLogger");

    public PageObjects(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //  Login Page

    /**
     * Used to mark a field on a Page Object to indicate an alternative mechanism
     * for locating the element or a list of element
     */

    @FindBy(id = "UserName")
    public WebElement username_txt;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    public WebElement password_txt;

    @FindBy(id = "btnLogin")
    public WebElement login_button;



    // User Page
    /**
     * Refer to testsuite package
     * class file  UserTest
     */

    @FindBy(xpath = "/html/body/div[2]/aside/section/ul/li[2]/a")
    public WebElement employee_click;


    @FindBy(css = "li.active:nth-child(1) > a:nth-child(1)")
    public WebElement click_create;

    @FindBy(id = "FirstName")
    public WebElement first_name;


    @FindBy(id = "txtmobileno")
    public WebElement user_no;



    /**
     * add following variables to UserTest to complete the Test Case
     */


    @FindBy(id = "txtemail")
    public WebElement user_mail;

    @FindBy(id = "txtcountry")
    public WebElement user_country;

    @FindBy(id = "txtcomments")
    public WebElement user_comments;



    /**
     * For more test
     * Clicking on CSS Properties
     */

    @FindBy(linkText = "more.aspx")
    public WebElement more_option;

    @FindBy(partialLinkText = "CSS Properties")
    public WebElement css_tab;

    @FindBy(css = "#a > a:nth-child(1)")
    public WebElement link1;


/*
    Keep adding objects of all the pages to be automated. No need to add all before writing the scripts.
  	Objects need to be added as the scripts are created
   
   */











}
