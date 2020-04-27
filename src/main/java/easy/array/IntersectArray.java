package easy.array;

import java.util.Arrays;

public class IntersectArray {

	public static void main(String[] args) {

		int[] num1 = { 5, 2, 2, 1 };
		int[] num2 = { 1, 2, 1, 7 };
		int[] it = intersect2(num1, num2);

		for (int i = 0; i < it.length; i++) {
			System.out.println(it[i]);
		}
	}

	public static int[] intersect2(int[] num1, int[] num2) {
		Arrays.sort(num1);
		Arrays.sort(num2);
		
		int i=0,j=0,k=0;
		
		int[] arr = new int [num1.length + num2.length];
		
		while(i < num1.length && j < num2.length) {
			
			if(num1[i]==num2[j]) {
				arr[k] = num1[i];
				k++; i++; j++;
			} else if(num1[i] < num2[j]) {
				i++;
				
			}else {
				j++;
			}
			
		}
		
        
		return Arrays.copyOf(arr, k);
    }

}
