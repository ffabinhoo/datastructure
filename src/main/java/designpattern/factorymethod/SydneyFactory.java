package designpattern.factorymethod;

public class SydneyFactory extends PizzaFactory{

	
	@Override
	public Pizza createPizza(TypePizza typePizza) {
		if (typePizza.equals(TypePizza.BANANA)) {
			return new BananaPizza();
		}else {
			return null;
		}
	}

	

}
