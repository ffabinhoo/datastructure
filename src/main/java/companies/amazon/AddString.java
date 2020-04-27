package companies.amazon;

public class AddString {

	public static void main(String[] args) {
		AddString addString = new AddString();
		String num1 = "19";
		String num2 = "59";
		String result = addString.addStrings(num1, num2);
		
		System.out.println(result);
	}

	public String addStrings(String num1, String num2) {
		
		StringBuffer sb = new StringBuffer();
		int carry = 0;
		int i = num1.length()-1;
		int j = num2.length()-1;
		
		while(i>=0 || j>=0) {
			int sum = carry;
			if (i>=0) {
				sum += num1.charAt(i) - '0';
				i--;
			}
			if (j>=0) {
				sum += num2.charAt(j) - '0';
				j--;
			}
			sb.append(sum%10);
			carry = sum /10;
		}
		if (carry !=0) {
			sb.append(carry);
		}
		return sb.reverse().toString();
	}

}
