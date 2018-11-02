package leetCode;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8,9,10};
	Arrays.stream(reverse(arr, 0, 9)).forEach(c->System.out.print(c+" "));
}

static int[] reverse(int[] arr, int start, int end){
	if(start==end || start > end) return arr;
	int temp = arr[start];
	arr[start] = arr[end];
	arr[end] = temp;
	
	start ++;
	end --;
	reverse(arr, start, end);
	return arr;
}
	
	
	
}
