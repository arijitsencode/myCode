package leetCode;

public class ArrayManipulation {
	static long arrayManipulation(int n, int[][] queries) {
		int[] arr = new int[n];
		for(int row = 0; row < queries.length; row++){
			applyOnArray(arr,queries[row][0],queries[row][1],queries[row][2]);
		}
		int max = Integer.MIN_VALUE;
		for(int idx = 0; idx < n; idx++){
			if(max < arr[idx]) max = arr[idx];
		}
		return max;

	}

	private static void applyOnArray(int[] arr, int startIdx, int endIdx, int addValue) {
		for(int idx = startIdx-1; idx < endIdx; idx++){
			arr[idx] += addValue;
		}
		
	}
	
	public static void main(String[] args) {
		int[][] operations = {
				{1,2,5},
				{1,6,10}
		};
		System.out.println(arrayManipulation(10, operations));
	}
}
