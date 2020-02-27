package junitexample;
/**
 * Aaron Foote
 * Junit Assertion variables and Assert Methods
 *
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class JunitBasics {

    @Test
    public void testAssertions() {
        //test data
        String str1 = new String ("StarWars Empire Strikes Back");
        String str2 = new String ("StarWars Empire Strikes Back");
        String str3 = null;
        String str4 = "stormTrooper";
        String str5 = "stormTrooper";

        int num1 = 5;
        int num2 = 6;

        String[] expectedArray = {"Darth Vader", "Emperor Palpatine", "Kylo ren"};
        String[] resultArray =  {"Darth Vader", "Emperor Palpatine", "Kylo ren"};

        //Check that two objects are equal
        assertEquals(str1, str2);

        //Check that a condition is true
        assertTrue (num1 < num2);

        //Check that a condition is false
        assertFalse(num1 > num2);

        //Check that an object isn't null
        assertNotNull(str1);

        //Check that an object is null
        assertNull(str3);

        //Check if two object references point to the same object
        assertSame(str4,str5);

        //Check if two object references not point to the same object
        assertNotSame(str1,str3);

        //Check whether two arrays are equal to each other.
        assertArrayEquals(expectedArray, resultArray);
    }


}//end of JunitBasics
