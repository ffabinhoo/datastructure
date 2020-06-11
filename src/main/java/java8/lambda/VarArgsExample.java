package java8.lambda;

import java.util.Arrays;

public class VarArgsExample {

	public static void main(String[] args) {
		VarArgsExample var = new VarArgsExample();
		String[] values = {"test1","test2"};
		//String values = "test";
		var.display(values );
	}

	static void display(String... values) {
		Arrays.asList(values).forEach(val->System.out.println(val));
	}

}
