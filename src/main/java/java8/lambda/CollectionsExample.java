package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Fabio","Mari","Mom","Dad");
		Collections.sort(names);
		names.forEach(name->System.out.println(name));
		
	}

}
