
package java8.intro.defaultMethodInterface;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OperationImpl implements Operation<Faction> {


    public void display() {
        System.out.println("This is faction display.");
    }

    @Override
    public Faction add(Faction firstNumber, Faction secondNumber) {
        Faction result = new Faction();
        int tempNumberator = (firstNumber.getNumerator() * secondNumber.getDenomerator() + secondNumber.getNumerator() * firstNumber.getDenomerator());
        int tempDenominator = (firstNumber.getDenomerator() * secondNumber.getDenomerator());
        result.setNumerator(tempNumberator);
        result.setDenomerator(tempDenominator);
        this.simplify(result);
        return result;
    }

    @Override
    public Faction multiply(Faction firstNumber, Faction secondNumber) {
        Faction result = new Faction();
        int tempNumberator = (firstNumber.getNumerator() * secondNumber.getNumerator());
        int tempDenominator = (firstNumber.getDenomerator() * secondNumber.getDenomerator());
        result.setNumerator(tempNumberator);
        result.setDenomerator(tempDenominator);
        this.simplify(result);
        return result;
    }

    public static int GCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return (a);
    }

    @Override
    public Faction simplify(Faction number) {
        int temp = GCD(number.getNumerator(), number.getDenomerator());
        number.setNumerator(number.getNumerator() / temp);
        number.setDenomerator(number.getDenomerator() / temp);
        return number;
    }

}
