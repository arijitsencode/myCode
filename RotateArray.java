package leetCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class RotateArray {
	// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int actualRotation = d%a.length;
        int[] result = new int[a.length];
        int idx = 0;
        for(int x = actualRotation; x<a.length; x++){
            result[idx++] = a[x];
        }
        for(int x = 0; x<actualRotation; x++){
            result[idx] = a[x];
            idx++;
        }
        
        return result;
    }


    public static void main(String[] args) throws IOException {
    	int[] a = new int[] {1,2,3,4,5};
    	Arrays.stream(rotLeft(a,4)).forEach(System.out::print);
    }

}
