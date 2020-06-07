package java8.functionalinterface;

import java.util.function.Function;
/*
Accepts one argument and produces a result;
First value represent what is coming in and the second represents the result;
Can be used to create functions with result such as converters.
*/

public class FunctionExample {
	
	public static void main(String[] args) {
		//converting Integer to String
		Function<Integer,String> converter = (num) -> Integer.toString(num);
		System.out.println("Length of 22 is: " + converter.apply(22).length());
		
		
		//converting String to Integer
		Function<String, Integer> converter2 = (s) -> Integer.parseInt(s);
		String num = "22";
		System.out.println(1 + converter2.apply(num) + " = 23");
		
	}

}
