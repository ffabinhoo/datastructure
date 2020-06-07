package java8.functionalinterface;
/*
	Unary operator
	Single argument with a return value

 */

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	
	public static void main(String[] args) {
		
		UnaryOperator<String> str = (msg) -> msg.toUpperCase();
		
		System.out.println(str.apply("Fabio as upper case"));
	}

}
