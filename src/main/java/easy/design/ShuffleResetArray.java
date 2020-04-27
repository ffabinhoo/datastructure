package easy.design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class ShuffleResetArray {
    private int[] array;
    private int[] original;

    private Random rand = new Random();
    
    public static void main(String[] args) {
    	int[] nums = {1,2,3,4,5,6,7,8,9,0};
    	ShuffleResetArray solution = new ShuffleResetArray(nums);
    	
    	int[] ret = solution.shuffle();
    	
    	for (int i = 0; i < ret.length; i++) {
			System.out.println(ret[i]);
		}
    	
    	ret = solution.reset();
    	
    	System.out.println("---");
    	for (int i = 0; i < ret.length; i++) {
		//	System.out.println(ret[i]);
		}
	}

    private List<Integer> getArrayCopy() {
        List<Integer> asList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            asList.add(array[i]);
        }
        return asList;
    }

    public ShuffleResetArray(int[] nums) {
        array = nums;
        original = nums.clone();
    }
    
    public int[] reset() {
        array = original;
        original = original.clone();
        return array;
    }
    
    public int[] shuffle() {
        List<Integer> aux = getArrayCopy();

        for (int i = 0; i < array.length; i++) {
            int removeIdx = rand.nextInt(aux.size());
            array[i] = aux.get(removeIdx);
            aux.remove(removeIdx);
        }

        return array;
    }
    
    
}