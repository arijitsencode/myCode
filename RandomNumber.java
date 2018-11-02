package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumber {
	public static void main(String[] args) {
        //style1();
        style2();
    }
	
	static void style1(){
		int size = 5;

        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int i = 1; i <= size; i++) {
            list.add(i);
        }

        Random rand = new Random();
        while(list.size() > 0) {
            int index = rand.nextInt(list.size());
            System.out.println("Selected: "+list.remove(index));
        }
	}
	
	static void style2(){
		int size = 5;

        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int i = 1; i <= size; i++) {
            list.add(i);
        }
        
        Set<Integer> num = new HashSet<Integer>(size);
        while(num.size() <= size){
        	Collections.shuffle(list);
        	if(!num.contains(list.get(0))){
        		System.out.println("Selected: "+list.get(0));
        		num.add(list.get(0));
        	}
        }
	}
}
