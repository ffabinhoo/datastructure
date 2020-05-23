package designpattern.factorymethod;

public class FactoryTwo extends PizzaFactory{

	@Override
	public Pizza createPizza() {
		
		Pizza product = new NYStylePizza();
		return product;
		
		
	}

	
}
