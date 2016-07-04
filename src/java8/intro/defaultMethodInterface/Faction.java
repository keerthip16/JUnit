
package java8.intro.defaultMethodInterface;


public class Faction {
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

    public Faction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Faction() {
    };

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public double getActualValue() {
        return (double) this.getNumerator() / this.getDenomerator();
    }

    public int compareTo(Faction faction) {
        return this.getActualValue() > faction.getActualValue() ? 1 : (-1);
    }
}
