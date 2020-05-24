package designpattern.factorymethod;

public class Main {
	
	
	public static void main(String[] args) {
		PizzaFactory factory = new SydneyFactory();
		
		factory.createPizza(TypePizza.BANANA).preparePizza();
		factory.createPizza(TypePizza.BANANA).bakePizza();
		
		////		////		////		////		////
		
		PizzaFactory factoryNY = new NYFactory();
		
		factoryNY.createPizza(TypePizza.CALABREZA).preparePizza();
		factoryNY.createPizza(TypePizza.CALABREZA).bakePizza();
		
		
		
		
	}

}
