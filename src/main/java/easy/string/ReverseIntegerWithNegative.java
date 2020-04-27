package easy.string;

public class ReverseIntegerWithNegative {

	public static void main(String[] args) {
		
		int x = -2346;
		System.out.println(reverse(x ));
	}

	public static int reverse(int x) {
		
		boolean signal = false;
		if (Integer.valueOf(x) < 0) {
			signal = true;
			x = Math.abs(x);
		}
		
		String ss = String.valueOf(x);
		
		char[] cc = ss.toCharArray();
		
		char aux;
		for (int i = 0; i < cc.length/2; i++) {
			aux = cc[i];
			cc[i] = cc[(cc.length-i) -1];
			cc[(cc.length-i)-1] = aux;
		}
		StringBuffer st = new StringBuffer();
		if (signal) {
			st.append("-");
		}
		for (char c : cc) {
			st.append(Character.toString(c));
			
		}
		Integer val = 0;
		try{
			val = Integer.valueOf(st.toString());
		}catch(NumberFormatException e) {
			
		}
		
		return val;

	}

}
