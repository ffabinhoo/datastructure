package designpattern.factorymethod;

public class Main {
	
	
	public static void main(String[] args) {
		PizzaFactory factory = new SydneyFactory();
		
		Pizza pizzaBanana = factory.createPizza(TypePizza.BANANA);
		pizzaBanana.preparePizza();
		pizzaBanana.bakePizza();
		
		////		////		////		////		////
		
		PizzaFactory factoryNY = new NYFactory();
		
		Pizza pizzaCalabreza = factoryNY.createPizza(TypePizza.CALABREZA);
		pizzaCalabreza.preparePizza();
		pizzaCalabreza.bakePizza();
		
		
		
	}

}
