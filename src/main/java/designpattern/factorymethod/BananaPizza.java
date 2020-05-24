package designpattern.factorymethod;

public class BananaPizza implements Pizza{

	@Override
	public void preparePizza() {
		System.out.println("pizza with Banana Pizza");
		
	}

	@Override
	public void bakePizza() {
		System.out.println("baking Banana Pizza");
		
	}

}
