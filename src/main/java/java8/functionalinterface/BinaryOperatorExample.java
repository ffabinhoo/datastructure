package java8.functionalinterface;
import java.util.function.BinaryOperator;

/*
 Binary operator
 Takes two arguments and returns one;

 */
public class BinaryOperatorExample {
	
	public static void main(String[] args) {
		
		BinaryOperator<Integer> add  = (a,b) -> a + b;
		
		System.out.println("adding two values: " + add.apply(10, 12));
	}

}
