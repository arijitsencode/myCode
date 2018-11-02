package leetCode;

import java.util.List;

import com.google.common.collect.Lists;

public class SecondSmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSecondSmallest(Lists.newArrayList(0,0,0)));
		System.out.println(findSecondLargest(Lists.newArrayList(1,4,2)));
	}

	static int findSecondSmallest(List<Integer> arr) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = smallest;

		for (int number : arr) {
			if (smallest > number) {
				secondSmallest = smallest;
				smallest = number;
			} else if (secondSmallest > number) {
				secondSmallest = number;

			}

		}

		return secondSmallest;
	}
	static int findSecondLargest(List<Integer> arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = largest;

		for (int number : arr) {
			if (largest < number) {
				secondLargest = largest;
				largest = number;
			} else if (secondLargest < number) {
				secondLargest = number;

			}

		}

		return secondLargest;
	}
}
