package designpattern.abstractfactory.builder;

public class SedanBuilder implements CarBuilder{
	
	Car car = new Sedan();

	@Override
	public CarBuilder addFrontDoor() {
		car.frontDoor = true;
		return this;
	}

	@Override
	public CarBuilder addBackDoor() {
		return this;
	}

	@Override
	public CarBuilder addMoonRoof() {
		return this;
	}
	
	@Override
	public CarBuilder addWeels() {
		return this;
	}
	
	public Car build() {
		return this.car;
	}

	

	
	

}
