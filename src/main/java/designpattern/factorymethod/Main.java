package designpattern.factorymethod;

public class Main {
	
	
	public static void main(String[] args) {
		PizzaFactory factory = new SydneyFactory();
		
		factory.createPizza().preparePizza();
		factory.createPizza().bakePizza();
		
		////		////		////		////		////
		
		PizzaFactory factoryNY = new NYFactory();
		
		factoryNY.createPizza().preparePizza();
		factoryNY.createPizza().bakePizza();
		
		
		
		
	}

}
