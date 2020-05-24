package designpattern.abstractfactory.builder;

public class SUVBuilder implements CarBuilder{
	
	Car car = new SUV();
	
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
	public Car build() {
		return car;
	}

	@Override
	public CarBuilder addWeels() {
		return this;
	}

}
