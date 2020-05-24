package designpattern.abstractfactory.builder;

public class SUV extends Car{
	private String model = "SUV";
	
	@Override
	public String toString() {
		return "[model=" + model + "]";
	}
	

}
