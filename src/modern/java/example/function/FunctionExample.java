package modern.java.example.function;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		/*function<String, Integer> toInt = new Function<String, Integer>() {
			@Override
			public Integer apply(final String value) {
				return Integer.parseInt(value);
			}
		};*/

		Function<String, Integer> toInt = (value) -> Integer.parseInt(value);

		final Integer number = toInt.apply("100");

		System.out.println(number);

		final Function<Integer, Integer> identity = Function.identity();
		final Function<Integer, Integer> identity2 = t -> t;

		System.out.println(identity.apply(999));
		System.out.println(identity2.apply(999));
	}
}
