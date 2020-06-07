package java8.functionalinterface;


public class TestFunctional {
	
	public static void main(String[] args) {
		
		PrintInterface msg = (str) -> {
			return str.toUpperCase();
		};
		System.out.println(msg.showHello("Hello test uppercase"));
	}
	

}
