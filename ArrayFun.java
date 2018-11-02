package leetCode;

public class ArrayFun {

	static int missingNumber(int[] input) {
		// Natural numbers
		int size = input.length;
		int expectedSum = ((size + 1) * (1 + size + 1)) / 2;
		int actualSum = 0;
		for (int x : input) {
			actualSum += x;
		}

		return expectedSum - actualSum;
	}

	static boolean searchNumber(int[] sortedInput, int num, int start, int end) {
		System.out.println(start + "," + end);
		int midIdx = (end + start) / 2;

		if (start <= end) {
			if (sortedInput[midIdx] == num) {
				System.out.println("found");
				return true;
			} else if (sortedInput[midIdx] > num) {
				searchNumber(sortedInput, num, start, midIdx - 1);
			} else {
				searchNumber(sortedInput, num, midIdx + 1, end);
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		// System.out.println(missingNumber(input));
		int[] input1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(searchNumber(input1, -1, 0, 9));
	}
}
