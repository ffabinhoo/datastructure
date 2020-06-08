package java8.lambda;

public class RunnableExample {
	
	public static void main(String[] args) {
		
		//runnable common example
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run 1");
			}
		};
		
		//runnable lambada
		Runnable r2 = () -> System.out.println("run 2");
		
		r1.run();
		r2.run();
	}

}
