package easy.sortingsearching;

public class FirstBadVersion {

	public static void main(String[] args) {
		
		int n = 100;
		System.out.println(firstBadVersion(n));
	}

	public static int firstBadVersion(int n) {
		
		int start = 0;
		int end = n;
		
		while(start < end) {
			int mid = start + (end-start) /2;
			
			if (!isBadVersion(mid)) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		
		
		return start;
	}
	
	public static  boolean isBadVersion(int m) {
		System.out.println("passed with " + m);
		if (m >= 100) return true;
		return false;
	}

}
