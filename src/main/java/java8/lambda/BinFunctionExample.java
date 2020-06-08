package java8.lambda;
import java.util.function.BiFunction;

public class BinFunctionExample {
	
	public static void main(String[] args) {
		BiFunction<String, String, String> concat = (a,b) -> a+b;
		
		String sentence = concat.apply("Fabio" + " ", "Costa");
		System.out.println(sentence);
	}
}
