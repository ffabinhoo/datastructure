package designpattern.composition;

public class PaymentRunner {
	
	public static void main(String[] args){
		
		try {
		Payment payment = new Payment();

		if (args[0].equals("card")) {
			payment.paymentMethod = new Card();
		}else if(args[0].equals("cash")) {
			payment.paymentMethod = new Cash();
		}
		
		payment.paymentMethod.pay();
		payment.paymentMethod.print();
		} catch (Exception e) {
			System.out.println("nothing was passed as argument");
		}
		
	}

}
