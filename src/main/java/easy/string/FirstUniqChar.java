package easy.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstUniqChar {

	public static void main(String[] args) {
		
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));

	}

	public static int firstUniqChar(String s) {
		char[] arr = s.toCharArray();
		Map<Character, Integer> map = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		String val = "";
		for (int i = 0; i < arr.length; i++) {
			Integer val_map = map.get(arr[i]);
			if (val_map==1) {
				return i;
			}
		}
		return -1;
	}

}
