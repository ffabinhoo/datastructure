package designpattern.factorymethod;

public class SydneyFactory extends PizzaFactory{

	
	@Override
	public Pizza createPizza(TypePizza typePizza) {
		if (typePizza.equals(TypePizza.BANANA)) {
			return new BananaPizza();
		}else if (typePizza.equals(TypePizza.SYDNEY)){
			return new SydneyStylePizza();
		}else if (typePizza.equals(TypePizza.CALABREZA)) {
			return new CalabrezaPizza();
		}
		return null;
	}


	

}
