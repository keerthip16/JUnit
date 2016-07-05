
package jUnit.intro.test;


import static org.junit.Assert.*;

import org.junit.Test;

import jUnit.intro.fraction.OperationImpl;

/**
 * 
 * @author DUNGNTH2
 *
 */
public class GCDTest {

    @Test
    public void testGCD() {
        //need to throw exception here?
        int actual_1 = OperationImpl.GCD(0, 6);
        int actual_2 = OperationImpl.GCD(-1, 6);
        int actual_3 = OperationImpl.GCD(7, 0);
        int expected_1 = 0;
        int expected_2 = 1;
        int expected_3 = -1;
        assertEquals(expected_1, actual_1);
        assertEquals(expected_2, actual_2);
        assertEquals(expected_3, actual_3);
    }

}
