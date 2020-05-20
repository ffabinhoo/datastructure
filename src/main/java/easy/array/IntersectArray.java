package easy.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class IntersectArray {

	public static void main(String[] args) {

		int[] num1 = { 1,2,2,1 };
		int[] num2 = { 2,2 };
		int[] it = intersect2(num1, num2);

		for (int i = 0; i < it.length; i++) {
			System.out.println(it[i]);
		}
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
	    HashSet<Integer> set1 = new HashSet<Integer>();
	    for (Integer n : nums1) set1.add(n);
	    HashSet<Integer> set2 = new HashSet<Integer>();
	    for (Integer n : nums2) set2.add(n);

	    set1.retainAll(set2);

	    int [] output = new int[set1.size()];
	    int idx = 0;
	    
	    for (int s : set1) output[idx++] = s;
	    
	    return output;
	  }

	public static int[] intersect2(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int i=0,j=0,k=0;
		
		Integer[] arr = new Integer [nums1.length + nums2.length];
		
		while(i < nums1.length && j < nums2.length) {
			
			if(nums1[i]==nums2[j]) {
				arr[k] = nums1[i];
				k++; i++; j++;
			} else if(nums1[i] < nums2[j]) {
				i++;
				
			}else {
				j++;
			}
			
		}
		
		Set<Integer> targetSet = new HashSet<Integer>();
		Collections.addAll(targetSet, arr);
		targetSet.remove(null);
		int[] array = targetSet.stream().mapToInt(Integer::intValue).toArray();
		
		return array;
    }

}
