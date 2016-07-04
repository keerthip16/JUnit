
package java8.intro.lambdaExpression;


import java.util.ArrayList;
import java.util.List;

import java8.intro.defaultMethodInterface.Faction;

public class SortingMain {

    public static void main(String[] s) {
        Faction f1 = new Faction(12, 3);
        Faction f2 = new Faction(-3, 4);
        Faction f3 = new Faction(1, 2);
        Faction f4 = new Faction(-1, 2);
        List<Faction> lst = new ArrayList<Faction>();
        lst.add(f1);
        lst.add(f2);
        lst.add(f3);
        lst.add(f4);

        Sorting<Faction> sorting = new SortingImpl();
        sorting.sortingLambdaExp_2(lst);
        System.out.println(lst.toString());
    }

}
