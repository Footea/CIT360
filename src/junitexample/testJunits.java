package junitexample;
/**
 * Aaron Foote
 * Junit test Assertion examples
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class testJunits {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JunitBasics.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

}//end of testJunits
