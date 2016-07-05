
package jUnit.intro.test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import jUnit.intro.fraction.Fraction;
import jUnit.intro.fraction.Operation;
import jUnit.intro.fraction.OperationImpl;

/**
 * 
 * @author DUNGNTH2 
 * this is professional :D
 *
 */
public class OperationImplTest {

    private Fraction f3;
    private Fraction f4;
    private Fraction f1;
    private Fraction f2;
    private Operation<Fraction> operation;

    @Before
    public void init() {

        f1 = new Fraction(12, 3);
        f2 = new Fraction(-3, 4);
        f3 = new Fraction(1, 2);
        f4 = new Fraction(-1, 2);

        operation = new OperationImpl();
    }

    @Test
    public void testAdd() {
        Fraction addExpected1 = new Fraction(0, 2);
        Fraction addActual1 = operation.add(f3, f4);
        assertTrue(addExpected1.equals(addActual1));

        Fraction addExpected2 = new Fraction(13, 4);
        Fraction addActual2 = operation.add(f1, f2);
        assertTrue(addExpected2.equals(addActual2));
    }

    @Ignore("Not yet implemented")
    public void testMultiply() {

    }


    @Ignore("Not yet implemented")
    public void testSimplify() {

    }

}
