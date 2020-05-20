package designpattern.composition;

public class Card implements PaymentMethod{

	@Override
	public void pay() {
		System.out.println(" pay with card");
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println("print - card");
		
	}

}
