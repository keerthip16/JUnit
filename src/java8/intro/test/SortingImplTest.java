
package java8.intro.test;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import java8.intro.defaultMethodInterface.Faction;
import java8.intro.lambdaExpression.Sorting;
import java8.intro.lambdaExpression.SortingImpl;

public class SortingImplTest {

    Faction f1 = new Faction(12, 3);
    Faction f2 = new Faction(-3, 4);
    Faction f3 = new Faction(1, 2);
    Faction f4 = new Faction(-1, 2);
    List<Faction> expected = new ArrayList<Faction>();
    Sorting<Faction> sort = new SortingImpl();

    @Test
    public void testSortingLambdaExp() {
        expected.add(f1);
        expected.add(f2);
        expected.add(f3);
        expected.add(f4);
        sort.sortingLambdaExp(expected);

        List<Faction> actuals = new ArrayList<Faction>();
        actuals.add(f2);
        actuals.add(f4);
        actuals.add(f3);
        actuals.add(f1);
        assertEquals(expected, actuals);

    }


}
