package designpattern.abstractfactory;

public class Observer extends UserRole {

	@Override
	public ObserverView createView() {
		return new ObserverView();
	}

	@Override
	public ObserverFunctions createFunctions() {
		
		return new ObserverFunctions();
		
	}
}
