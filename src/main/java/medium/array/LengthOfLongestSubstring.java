package medium.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		//String s = "dvdf";
		String s = "pwwkew";
		//String s = "ohomm";
		//String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	public static int lengthOfLongestSubstring_site(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

	public static int lengthOfLongestSubstring(String s) {
		
		int a_pointer = 0;
		int b_pointer = 0;
		int tot = 0;
		
		HashSet<Character> hash_set = new HashSet();
		
		while(b_pointer < s.length()) {
			
			if(!hash_set.contains(s.charAt(b_pointer))) {
				hash_set.add(s.charAt(b_pointer));
				b_pointer++;
				tot = Math.max(tot, hash_set.size());
				
			}else {
				hash_set.remove(s.charAt(a_pointer));
				a_pointer++;
			}
			
		}
		
		
		
		

		return tot;

	}

}
