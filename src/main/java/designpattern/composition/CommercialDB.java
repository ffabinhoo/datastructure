package designpattern.composition;

public class CommercialDB implements AbstractDb {

	@Override
	public void select() {
		System.out.println("select commercial db");

	}

	@Override
	public void update() {
		System.out.println("update commercial db");

	}

	@Override
	public void delete() {
		System.out.println("delete commercial db");
	}

	@Override
	public void insert() {
		System.out.println("insert commercial db");
	}

}
