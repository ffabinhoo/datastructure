package designpattern.abstractmethod;

public class Main {
	
	public static void main(String[] args) {
		
		UserRole userRole = new Forecaster();
		
		View view = userRole.createView();
		System.out.println(view.getClass().toString());
		
		Functions functions = userRole.createFunctions();
		System.out.println(functions.getClass().toString());
		
	}

}
