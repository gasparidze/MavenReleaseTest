package org.example;

import lombok.AccessLevel;
import lombok.ConfigurationKeys;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        TestService testService = new TestService();
        testService.testMethod();
    }
}