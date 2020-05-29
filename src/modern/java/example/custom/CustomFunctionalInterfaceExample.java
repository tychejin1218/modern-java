package modern.java.example.custom;

import java.math.BigDecimal;

public class CustomFunctionalInterfaceExample {

	public static void main(final String[] args) {

		// println(1, 2, 3, (i1, i2, i3) -> String.valueOf(i1 + i2 + i3));

		// println("Area is ", 12, 20, (message, length, width) -> String.valueOf(message + (length * width)));

		// println(1L, "tychejin", "tychejin@naver.com", (id, name, email) -> "User Info : ID=" + id + ", NAME=" + name + ", EMAIL=" + email);

		// final Function3<Integer, Integer, Integer, String> f3 = (i1, i2, i3) -> String.valueOf(i1 + i2 + i3);

		// BigDecimalToCurrency bigDecimalToCurrency = bd -> "$" + bd.toString();
		// System.out.println(bigDecimalToCurrency.toCurrency(new BigDecimal("120.00")));

		final InvalidFunctionalInterface invalidFunctionalInterface = new InvalidFunctionalInterface() {
			@Override
			public <T> String mkString(final T value) {
				return value.toString();
			}
		};

		System.out.println("annoymous class : " + invalidFunctionalInterface.mkString(123));

		// Lambda Expression을 사용할 수 없음
		// final InvalidFunctionalInterface invalidFunctionalInterface2 = value -> value.toString();
	}

	private static <T1, T2, T3> void println(T1 t1, T2 t2, T3 t3, Function3<T1, T2, T3, String> function) {
		System.out.println(function.apply(t1, t2, t3));
	}
}

@FunctionalInterface
interface Function3<T1, T2, T3, R> {
	R apply(T1 t1, T2 t2, T3 t3);
}

// Functional Interface 구현 시 abstract method가 한 개 이상이면 에러가 발생
/*@FunctionalInterface
interface Function3<T1, T2, T3, R> {
	R apply(T1 t1, T2 t2, T3 t3);	
	//void print(int i);
}*/

@FunctionalInterface
interface BigDecimalToCurrency {
	String toCurrency(BigDecimal value);
}

// Generic method를 가지는 Functional Interface는 Lambda Expression을 사용할 수 없음
@FunctionalInterface
interface InvalidFunctionalInterface {
	<T> String mkString(T value);
}