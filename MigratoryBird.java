package leetCode;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBird {

    static int migratoryBirds(int n, int[] ar) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>(5);
        for(int x=0; x<n; x++){
            Integer existingCount = counts.get(ar[x]);
            if(existingCount != null){
                counts.put(ar[x], existingCount.intValue() + 1);
            }else{
                counts.put(ar[x], 1);
            }
        }
        int max = 0;
        int maxCt = 0;
        for(int x = 1; x<5; x++){
            int num1 = x;
            Integer ct1 = counts.get(x);
            if(ct1 != null && ct1 > maxCt){
                max = num1;
                maxCt = ct1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}



