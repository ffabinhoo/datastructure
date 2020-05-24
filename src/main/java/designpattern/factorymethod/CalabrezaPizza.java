package designpattern.factorymethod;

public class CalabrezaPizza implements Pizza {

	@Override
	public void preparePizza() {
		System.out.println("preparing Calabreza Pizza");

	}

	@Override
	public void bakePizza() {
		System.out.println("baking Calabreza Pizza");

	}

}
