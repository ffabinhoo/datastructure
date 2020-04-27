package hard.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongestDuplicateSubstring {
	
	private static final String S = "fabio place new  articles place  fabio articles test test";
	
	public static void main(String[] args) {
		LongestDuplicateSubstring solution = new LongestDuplicateSubstring();
		String result = solution.longestDupSubstring(S);
		
		System.out.println(result);
		
	}
    
    public String longestDupSubstring(String S) {
        int low = 1, high = S.length() - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (ok(S, mid)){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        //System.out.print(ok(S, 6));
        return getDup(S, high);
    }
    
    boolean ok(String s, int dupLen){
        return getDup(s, dupLen).length() > 0;
    }
    String getDup(String s, int dupLen){
        HashSet<List<Long>> set = new HashSet<>();
        long mod = 1000000007L;
        List<Long> primes = Arrays.asList(5L, 7L);
        List<Long> primPower = new ArrayList<>();
        List<Long> hashV = new ArrayList<>();
        
        for (long prim: primes){
            long hv = 0;
            long primP = 1;
            for (int i = 0; i < dupLen; i++){
                hv = hv * prim + s.charAt(i);
                hv %= mod;
                primP = (primP*prim)%mod;
            }
            hashV.add(hv);
            primPower.add(primP);
        }
        set.add(hashV);
        for (int i = 1; i + dupLen - 1 < s.length(); i++){
            List<Long> sign = new ArrayList<>();
            for (int j = 0; j < hashV.size(); j++){
                long hv = hashV.get(j);
                long prim = primes.get(j);
                long primP = primPower.get(j);
                hv = (hv * prim + s.charAt(i + dupLen - 1)) % mod;
                hv -= (primP * s.charAt(i - 1)) % mod;
                hv = (hv + mod) % mod;
                sign.add(hv);
            }
            hashV = sign;
            if (set.contains(hashV)){
                return s.substring(i, i + dupLen);
            }
            set.add(hashV);
        }
        return "";
    }
}
