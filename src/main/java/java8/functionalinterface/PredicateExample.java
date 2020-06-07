package java8.functionalinterface;

import java.util.function.Predicate;
/*
	Predicates:
	Takes one argument, returns a Boolean
	Works as if statement*****
*/
public class PredicateExample {
	
	public static void main(String[] args) {
		Predicate <String> stringLen = (s)-> s.length() > 10;
		
		String str = "Fabio Costa";

		if(stringLen.test(str)) {
			System.out.println(stringLen.test(str ) +  " - is greater than 10 ");
		}else {
			System.out.println(stringLen.test(str ) +  " - is less than 10 ");

		}
	}

}
