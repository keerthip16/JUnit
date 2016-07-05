
package jUnit.intro.test;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import jUnit.intro.fraction.Fraction;
import jUnit.intro.fraction.OperationImpl;
import jUnit.intro.sorting.Sorting;
import jUnit.intro.sorting.SortingImpl;

/**
 * 
 * @author DUNGNTH2 this is not professional but basically this is how a test class should look like
 */
public class SortingImplTest {

    Fraction f1 = new Fraction(12, 3);
    Fraction f2 = new Fraction(-3, 4);
    Fraction f3 = new Fraction(1, 2);
    Fraction f4 = new Fraction(-1, 2);
    Fraction f5 = new Fraction(0, 2);
    List<Fraction> expected = new ArrayList<Fraction>();
    List<Fraction> actual = new ArrayList<Fraction>();
    List<Fraction> actual_1 = new ArrayList<Fraction>();
    List<Fraction> actual_2 = new ArrayList<Fraction>();
    Sorting<Fraction> sort = new SortingImpl();

    @Before
    public void init() {
        actual.add(f1);
        actual.add(f2);
        actual.add(f3);
        actual.add(f4);
        actual.add(f5);

        actual_1.add(f1);
        actual_1.add(f2);
        actual_1.add(f3);
        actual_1.add(f4);
        actual_1.add(f5);

        actual_2.add(f1);
        actual_2.add(f2);
        actual_2.add(f3);
        actual_2.add(f4);
        actual_2.add(f5);

        expected.add(f2);
        expected.add(f4);
        expected.add(f5);
        expected.add(f3);
        expected.add(f1);

    }

    @Test
    public void testSortingLambdaExp() {

        sort.sortingLambdaExp(actual_1);

        assertEquals(expected, actual_1);

    }

    @Test
    public void testSorting() {

        sort.sorting(actual);

        assertEquals(expected, actual);

    }

    @Test
    public void testSortingLambdaExp_2() {

        sort.sortingLambdaExp_2(actual_2);

        assertEquals(expected, actual_2);

    }

}
