
package jUnit.intro.fraction;


import jUnit.intro.constant.CONSTANT;

public class OperationImpl implements Operation<Fraction> {

    @Override
    public Fraction add(Fraction firstNumber, Fraction secondNumber) {
        Fraction result = new Fraction();
        int tempNumberator = (firstNumber.getNumerator() * secondNumber.getDenomerator() + secondNumber.getNumerator() * firstNumber.getDenomerator());
        int tempDenominator = (firstNumber.getDenomerator() * secondNumber.getDenomerator());
        result.setNumerator(tempNumberator);
        result.setDenomerator(tempDenominator);
        this.simplify(result);
        return result;
    }

    @Override
    public Fraction multiply(Fraction firstNumber, Fraction secondNumber) {
        Fraction result = new Fraction();
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
        if (a == 0)
            return CONSTANT.ZERO;
        else {
            if (b == 0)
                return CONSTANT.ERROR_CODE;// error code
            else {
                while (a != b) {
                    if (a > b)
                        a = a - b;
                    else
                        b = b - a;
                }
                return (a);
            }
        }

    }

    @Override
    public Fraction simplify(Fraction number) {
        int temp = GCD(number.getNumerator(), number.getDenomerator());
        if (temp == 0)
            return number;
        else {
            number.setNumerator(number.getNumerator() / temp);
            number.setDenomerator(number.getDenomerator() / temp);
            return number;
        }
    }

}
