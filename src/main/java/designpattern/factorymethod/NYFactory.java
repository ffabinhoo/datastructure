package designpattern.factorymethod;

public class NYFactory extends PizzaFactory{

	@Override
	public Pizza createPizza() {
		Pizza product = new NYStylePizza();
		return product;
	}

	

}
