package leetCode;

import java.util.Scanner;



public class ReducedString {

    static String super_reduced_string(String s){
       return null; 
    }
    
    static String delRepeat(String input){
        for(int x=0; x<=input.length()-1;x++){
            if(input.charAt(x)==input.charAt(x+1)){
                input = input.substring(0, x)+input.substring(x+2);
                x=0;
            }
        }
        
        return input;
    }

    public static void main(String[] args) {
        //System.out.println(delRepeat("aaabbbccc"));
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = delRepeat(s);
        System.out.println(result);
    }
}

