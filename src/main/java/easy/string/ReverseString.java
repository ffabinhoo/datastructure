package easy.string;

public class ReverseString {

	public static void main(String[] args) {
		char[] s = {'H','e','l','l','o','1'};
		reverseString(s);
	}

	public static void reverseString(char[] s) {
		
		char aux;
		int j = s.length-1;
		for (int i = 0; i < s.length/2; i++) {
			aux = s[i];
			s[i] = s[j];
			s[j] = aux;
			j--;
		}
		
		for (char c : s) {
			System.out.println(c);
		}
		
	}

}
