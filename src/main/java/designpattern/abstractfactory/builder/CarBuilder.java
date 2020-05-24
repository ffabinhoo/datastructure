package designpattern.abstractfactory.builder;

public interface CarBuilder {
	public CarBuilder addFrontDoor();
	public CarBuilder addBackDoor();
	public CarBuilder addMoonRoof();
	public CarBuilder addWeels();
	public Car build();
	

}
