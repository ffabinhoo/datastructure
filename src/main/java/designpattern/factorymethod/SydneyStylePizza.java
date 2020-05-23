package designpattern.factorymethod;

public class SydneyStylePizza implements Pizza{

	@Override
	public void preparePizza() {
		System.out.println("prepare pizza Sydney Style");
		
	}

	@Override
	public void bakePizza() {
		System.out.println("bake pizza Sydney Style");
		
	}

	

}
