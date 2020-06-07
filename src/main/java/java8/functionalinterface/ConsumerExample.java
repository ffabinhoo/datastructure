package java8.functionalinterface;

import java.util.function.Consumer;
/*
 	Consumer:
	Accepts single argument with no return value;
	Used for transformations such as toLowerCase()*****

 */
public class ConsumerExample {
	public static void main(String[] args) {
		
		Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
		String str = "Fabio Costa";
		consumerStr.accept(str );
	}

}
