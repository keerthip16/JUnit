
package jUnit.intro.fraction;


public interface Operation<T> {
    public T add(T firstNumber, T secondNumber);

    public T multiply(T firstNumber, T secondNumber);

    public T simplify(T number) throws Throwable;

}
