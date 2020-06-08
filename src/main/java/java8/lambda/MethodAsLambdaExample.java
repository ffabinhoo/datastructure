package java8.lambda;

import java.math.BigInteger;
import java.util.function.*;

public class MethodAsLambdaExample {
	
	
	public static void main(String[] args) {
		
		IntFunction<String> intToString = Integer::toString;
		System.out.println("Integer max contains  " + intToString.apply(Integer.MAX_VALUE).length() + " numbers ");
		System.out.println(Integer.MAX_VALUE);
		
		//*********************************
		
		//Converter BigInteger to String
		Function<String,BigInteger> newBigInt = BigInteger::new;
		String num = "123456789";
		System.out.println(num + " as BigInteger is " + newBigInt.apply(num));
		
		//*********************************
		
		UnaryOperator<String> makeGreeting = "Hello "::concat;
		
		System.out.println(makeGreeting.apply("Fabio"));
		
		
	}

}
