package com.jala.testsuites;



import org.testng.annotations.Test;


public class MoreTest extends LoginTest {

    @Test
    public void testMoreAdmin() throws Exception {
        try {

            /**
             * refer to PageObjects
             * if u getting this
             *  * SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
             *  * SLF4J: Defaulting to no-operation (NOP) logger implementation
             *  * This warning, i.e. not an error, message is reported when no SLF4J providers
             *  * could be found on the class path. Placing one (and only one) of slf4j-nop.jar slf4j-simple.jar,
             *  * slf4j-reload4j.jar, slf4j-jdk14.jar or logback-classic.jar on the class path should solve the problem.
             *
             *
             */

            log.info("*************** More Tab Actions Running **************");
            System.out.println("Clicking ................");
            pageObj.click(pageObj.employee_click);
            pageObj.click(pageObj.click_create);
            pageObj.type(pageObj.first_name,"Jacob");

            /**
             * Clicking on link 1
             */
            pageObj.click(pageObj.link1);
            log.info("***************More Tab Actions Ending ****************");


        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
