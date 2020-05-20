package designpattern.composition;

public class WebRunner{

	public static void main(String[] args) {
		
		WebSystem web = new WebSystem();
		//web.db = new TestDB();
		web.db = new CommercialDB();
		web.db.select();
		
	}
}
