package leetCode;

import java.util.stream.Collectors;

public class NumberReversal {

	static int reverse(int input) {
		int output = 0;
		while(input !=0){
			output = (output*10)+(input%10);
			input /= 10;
		}
		
		return output;
	}
	
	static int strToInt(String input){
		int result = 0;
		for(char c:input.toCharArray()){
			result = result*10 + Integer.parseInt(c+"");
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		System.out.println(reverse(12345678));
		System.out.println(strToInt("12345123411"));
	}
}
