
package jUnit.intro.sorting;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import jUnit.intro.fraction.Fraction;

public class SortingImpl implements Sorting<Fraction> {

    @Override
    public void sortingLambdaExp(List<Fraction> lst) {
        Collections.sort(lst, (f1, f2) -> {
            return f1.getActualValue() > f2.getActualValue() ? 1 : (-1);
        });
    }

    @Override
    public void sorting(List<Fraction> lst) {
        Collections.sort(lst, new Comparator<Fraction>() {

            @Override
            public int compare(Fraction f1, Fraction f2) {

                return f1.getActualValue() > f2.getActualValue() ? 1 : (-1);

            }

        });

    }

    @Override
    public void sortingLambdaExp_2(List<Fraction> lst) {

        Collections.sort(lst, (Fraction f1, Fraction f2) -> {
            return f1.compareTo(f2);
        });
    }

}
