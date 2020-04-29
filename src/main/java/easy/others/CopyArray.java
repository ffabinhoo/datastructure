package easy.others;

import java.util.Arrays;

public class CopyArray {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		CopyArray cp = new CopyArray();
		//int[] result = cp.copyArray(arr );
		int[] result = cp.appendToNew(arr, 6);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);	
		}
	}
	
	public int[] copyArray(int[] array) {
		int [] copy = new int[0];
		
		for (int value : array) {
			copy = appendToNew(copy, value);
		}
		
		
		return copy;
	}

	public int[] appendToNew(int[] array, int value) {
		//copy all elements over to new array
		int[] bigger = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			bigger[i] = array[i];
			
		}
		//add new element
		bigger[bigger.length -1] = value;
		return bigger;
		
	}

}
