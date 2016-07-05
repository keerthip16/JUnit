
package jUnit.intro.sorting;


import java.util.ArrayList;
import java.util.List;

import jUnit.intro.fraction.Fraction;

public class SortingMain {

    public static void main(String[] s) {
        Fraction f1 = new Fraction(12, 3);
        Fraction f2 = new Fraction(-3, 4);
        Fraction f3 = new Fraction(1, 2);
        Fraction f4 = new Fraction(-1, 2);
        List<Fraction> lst = new ArrayList<Fraction>();
        lst.add(f1);
        lst.add(f2);
        lst.add(f3);
        lst.add(f4);

        Sorting<Fraction> sorting = new SortingImpl();
        sorting.sortingLambdaExp_2(lst);
        System.out.println(lst.toString());
    }

}
