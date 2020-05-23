package designpattern.factorymethod;

public class SydneyFactory extends PizzaFactory{

	@Override
	public Pizza createPizza() {
		Pizza product = new SydneyStylePizza();
		return product;
	}

	

}
