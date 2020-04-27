package medium.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountingElements {

	public static void main(String[] args) {
		int[] arr = {1,3,2,3,5,0};
		int result = countElements(arr );
		System.out.println(result);
	}

	public static <T> int countElements(int[] arr) {
		int count = 0;
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i]+1)){
				count++;
			}
		}
		

		return count;

	}

}
