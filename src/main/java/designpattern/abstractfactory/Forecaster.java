package designpattern.abstractfactory;

public class Forecaster extends UserRole {

	@Override
	public ForecastView createView() {
		return new ForecastView();
	}

	@Override
	public ForecastFunctions createFunctions() {
		
		return new ForecastFunctions();
		
	}
}
