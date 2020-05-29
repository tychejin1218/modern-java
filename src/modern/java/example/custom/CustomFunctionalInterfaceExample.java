package modern.java.example.custom;

public class CustomFunctionalInterfaceExample {

	public static void main(final String[] args) {

		// println(1, 2, 3, (i1, i2, i3) -> String.valueOf(i1 + i2 + i3));

		// println("Area is ", 12, 20, (message, length, width) -> String.valueOf(message + (length * width)));

		println(1L, "tychejin", "tychejin@naver.com", (id, name, email) -> "User Info : ID=" + id + ", NAME=" + name + ", EMAIL=" + email);
	}

	private static <T1, T2, T3> void println(T1 t1, T2 t2, T3 t3, Function3<T1, T2, T3, String> function) {
		System.out.println(function.apply(t1, t2, t3));
	}
}

@FunctionalInterface
interface Function3<T1, T2, T3, R> {
	R apply(T1 t1, T2 t2, T3 t3);
}

// FunctionalInterface을 구현 시 abstract method가 하나 이상 존재하면 에러가 발생
/*@FunctionalInterface
interface Function3<T1, T2, T3, R> {
	R apply(T1 t1, T2 t2, T3 t3);	
	//void print(int i);
}*/