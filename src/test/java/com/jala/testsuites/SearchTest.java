package com.jala.testsuites;

import com.jala.selenium.framework.BaseTest;

import org.testng.annotations.Test;



    public class SearchTest extends BaseTest {
        /**
         * @throws Exception
         *
         * if u getting this
         *  * SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
         *  * SLF4J: Defaulting to no-operation (NOP) logger implementation
         *  * This warning, i.e. not an error, message is reported when no SLF4J providers
         *  * could be found on the class path. Placing one (and only one) of slf4j-nop.jar slf4j-simple.jar,
         *  * slf4j-reload4j.jar, slf4j-jdk14.jar or logback-classic.jar on the class path should solve the problem.
         */

        @Test
        public void testSearchAdmin() throws Exception {
            try {

                /**
                 * More Test should be added refer to PageObjects
                 */

                log.info("***************Checking User Search **************");
                System.out.println("First Test ................");
              //  pageObj.click(pageObj.user_search);


            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }


        }
    }


