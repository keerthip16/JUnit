
package java8.intro.defaultMethodInterface;


import java.util.ArrayList;
import java.util.List;

public class FactionMain {
    public static void main(String[] s) {
        Faction f1 = new Faction(12, 3);
        Faction f2 = new Faction(-3, 4);
        Faction f3 = new Faction(1, 2);
        List<Faction> lst = new ArrayList<Faction>();
        lst.add(f1);
        lst.add(f2);
        lst.add(f2);
        lst.add(f3);
        Operation<Faction> operation = new OperationImpl();

        System.out.println(operation.add(f1, f2).toString());
        System.out.println(operation.multiply(f1, f2).toString());
        operation.display();
        System.out.println(lst);

    }

}
