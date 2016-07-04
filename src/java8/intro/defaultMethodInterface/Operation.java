package java8.intro.defaultMethodInterface;


public interface Operation<T> {
	public T add(T firstNumber, T secondNumber);

	public T multiply(T firstNumber, T secondNumber);

	public T simplify(T number);

	public default void display() {
		System.out.println("Here is the display of interface!");
	}

}
