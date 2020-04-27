package medium.queue;

import java.util.PriorityQueue;

public class KClosestPoint {

	public static void main(String[] args) {
		int[] point1 = {3,3};
		int[] point2 = {5,-1};
		int[] point3 = {-2,4};
		int[][] points = {point3, point2, point1};
		int K = 2;		
		int[][] ret = kClosest(points, K);
		
		for (int i = 0; i < ret.length; i++) {
			for (int j = 0; j < ret[i].length; j++) {
				System.out.print("-" +ret[i][j]);
			}
		}

	}

	public static int[][] kClosest(int[][] points, int K) {
		PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((a,b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]) );
		
		
		for (int[] point : points) {
			maxHeap.add(point);
			if (maxHeap.size() > K) {
				maxHeap.remove();
			}
		}
		
		int[][] result = new int [K][2];
		
		while(K-- > 0) {
			result[K] = maxHeap.remove();
		}
		
		return result;
	}

}
