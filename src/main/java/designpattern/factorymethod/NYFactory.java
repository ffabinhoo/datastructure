package designpattern.factorymethod;

public class NYFactory extends PizzaFactory{

	@Override
	public Pizza createPizza(TypePizza typePizza) {
		if (typePizza.equals("BANANA")) {
			return new BananaPizza();
		}else {
			return new SydneyStylePizza();
		}
		
	}

	
	

}
