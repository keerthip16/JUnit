
package jUnit.intro.fraction;


public class Fraction {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenomerator() {
        return denominator;
    }

    public void setDenomerator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction() {
    };

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public double getActualValue() {
        return (double) this.getNumerator() / this.getDenomerator();
    }

    public int compareTo(Fraction faction) {
        return this.getActualValue() > faction.getActualValue() ? 1 : (-1);
    }

    @Override
    public boolean equals(Object obj) {
        Fraction f = new Fraction();
        if (obj instanceof Fraction) {
            f = (Fraction) obj;
        }
        return (this.getActualValue() == f.getActualValue());

    }

}
