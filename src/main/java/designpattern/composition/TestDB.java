package designpattern.composition;

public class TestDB implements AbstractDb {

	@Override
	public void select() {
		System.out.println("select test");

	}

	@Override
	public void update() {
		System.out.println("update test");

	}

	@Override
	public void delete() {
		
	}

	@Override
	public void insert() {
		
	}

}
