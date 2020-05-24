package designpattern.abstractfactory;

public abstract class UserRole {
	
	public void operation() {
		System.out.println("operation");
	}
	abstract public View createView();
	abstract public Functions createFunctions();
	

}
