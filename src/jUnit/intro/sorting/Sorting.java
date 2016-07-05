
package jUnit.intro.sorting;


import java.util.List;

import jUnit.intro.fraction.Fraction;

public interface Sorting<T> {

    public void sorting(List<T> lst);

    public void sortingLambdaExp(List<Fraction> lst);

    public void sortingLambdaExp_2(List<Fraction> lst);
}
