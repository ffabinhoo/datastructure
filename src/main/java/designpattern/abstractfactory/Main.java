package designpattern.abstractfactory;

public class Main {
	
	public static void main(String[] args) {
		
		//UserRole userRole = new Forecaster();
		UserRole userRole = new Observer();
		
		View view = userRole.createView();
		System.out.println(view.getClass().toString());
		
		Functions functions = userRole.createFunctions();
		System.out.println(functions.getClass().toString());
		
	}

}
