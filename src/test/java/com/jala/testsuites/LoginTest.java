/* Do remember writing more test scripts is a waste of time. 
 * Just write 5 scripts for each page and understand the different real time scenarios.
 * 
 * Only a few scripts are written for reference. Everyone is expected to add 5 more scripts for each page covering all the controls.
 * Feel free to contact us for any questions
 * 
 */

package com.jala.testsuites;

import com.jala.selenium.framework.BaseTest;
import org.testng.annotations.Test;

/**
 *
 * @author JALA Academy
 *
 * if u getting this
 * SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
 * SLF4J: Defaulting to no-operation (NOP) logger implementation
 * This warning, i.e. not an error, message is reported when no SLF4J providers
 * could be found on the class path. Placing one (and only one) of slf4j-nop.jar slf4j-simple.jar,
 * slf4j-reload4j.jar, slf4j-jdk14.jar or logback-classic.jar on the class path should solve the problem.
 *
 */

public class LoginTest extends BaseTest {
    /**
     *
     * @throws Exception
     */

    @Test
    public void testLoginAdmin() throws Exception {
        try {

            log.info("*************** Entering login Admin**************");
            System.out.println("First Test ................");
            pageObj.type(pageObj.username_txt, "training@jalaacademy.com");
            pageObj.type(pageObj.password_txt, "jobprogram ");
            pageObj.click(pageObj.login_button);

            log.info("*************** leaving login Admin**************");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        finally {
            /**
             * Finally block to be added here
             */

        }

    }

}
