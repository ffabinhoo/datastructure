package designpattern.abstractfactory.builder;

public class CarDirector {
	
	public static void main(String[] args) {
		
		Car car = new SUVBuilder().addBackDoor().addFrontDoor().addWeels().build();
		System.out.println(car.frontDoor);
		
		Car car2 = new SUVBuilder().addBackDoor().addWeels().build();
		System.out.println(car2.frontDoor);
		
		
		
	}
}
