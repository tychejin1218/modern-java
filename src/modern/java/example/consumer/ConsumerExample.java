package modern.java.example.consumer;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerExample {

	private static void consumerExamples() {

		/*final Consumer<String> print = new Consumer<String>(){
			@Override
			public void accept(final String value) {
				System.out.println(value);
			}
		};*/
		
		final Consumer<String> print = value -> System.out.println(value);
		// Function은 return 값이 존재해야함
		//final Function<String, Void> print2 = value -> System.out.println(value);
		print.accept("Hello World");

		final Consumer<String> greetings = value -> System.out.println("Hello " + value);
		greetings.accept("World");
	}

	public static void main(final String[] args) {
		consumerExamples();
	}
}