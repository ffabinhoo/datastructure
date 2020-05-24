package designpattern.factorymethod;

public abstract class PizzaFactory  {
	
	public abstract Pizza createPizza(TypePizza typePizza);
	
	public Pizza orderPizza() {
		System.out.println("orderPizza abstract Pizza factory");
		return null;
	}
	
	
	

}
