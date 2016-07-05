
package jUnit.intro.fraction;


import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author DUNGNTH2
 * classic way to check whether methods run properly
 */
public class FractionMain {
    public static void main(String[] s) {
        Fraction f1 = new Fraction(12, 3);
        Fraction f2 = new Fraction(-3, 4);
        Fraction f3 = new Fraction(1, 2);
        Fraction f4 = new Fraction(-1,2);
        List<Fraction> lst = new ArrayList<Fraction>();
        lst.add(f1);
        lst.add(f2);
        lst.add(f2);
        lst.add(f3);
        Operation<Fraction> operation = new OperationImpl();

        System.out.println(operation.add(f1, f2).toString());
        System.out.println(operation.multiply(f1, f2).toString());
        System.out.println(operation.add(f3, f4));
        System.out.println(lst);

    }

}
