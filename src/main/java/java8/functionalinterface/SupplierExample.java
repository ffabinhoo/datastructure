package java8.functionalinterface;

import java.util.function.Supplier;

/*
 	Supplier
	Represents a supplier of results;
	Doesn’t contain any argument;

 */

public class SupplierExample {
	public static void main(String[] args) {
		Supplier <String> s = ()-> "printing something"; 
		
		System.out.println(s.get());
	}

}
