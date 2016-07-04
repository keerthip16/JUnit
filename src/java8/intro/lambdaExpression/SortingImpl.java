
package java8.intro.lambdaExpression;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8.intro.defaultMethodInterface.Faction;

public class SortingImpl implements Sorting<Faction> {

    @Override
    public void sortingLambdaExp(List<Faction> lst) {
        Collections.sort(lst, (f1, f2) -> {
            return f1.getActualValue() > f2.getActualValue() ? 1 : (-1);
        });
    }

    @Override
    public void sorting(List<Faction> lst) {
        Collections.sort(lst, new Comparator<Faction>() {

            @Override
            public int compare(Faction f1, Faction f2) {

                return f1.getActualValue() > f2.getActualValue() ? 1 : (-1);

            }

        });

    }

    @Override
    public void sortingLambdaExp_2(List<Faction> lst) {

        Collections.sort(lst, (Faction f1, Faction f2) -> {
            return f1.compareTo(f2);
        });
    }

}
