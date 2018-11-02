package leetCode;

import java.util.Scanner;
import java.util.Stack;

public class Solutions {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String notation = in.nextLine();
        System.out.println(calculate(notation));
    }
    
    public static String calculate(String notation){
        //5 3 * 2 +
        int answer = 0;
		String operators = "+-*/";
        String[] stuff = notation.split(" ");
 
		Stack<String> numberStack = new Stack<String>();
 
        for (String t: stuff) {
			if (!operators.contains(t)) {
				numberStack.push(t);
			} else {
				int a = Integer.valueOf(numberStack.pop());
				int b = Integer.valueOf(numberStack.pop());
				switch (t) {
				case "/":
					numberStack.push(String.valueOf(a / b));
					break;
				case "*":
					numberStack.push(String.valueOf(b * a));
					break;
				case "+":
					numberStack.push(String.valueOf(a + b));
					break;
				case "-":
					numberStack.push(String.valueOf(b - a));
					break;
				}
			}
		}
 
		answer = Integer.valueOf(numberStack.pop());
 
		return answer+"";
    }
}
