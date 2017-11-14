package main;
import java.util.*;

public class multiplesOf3n5 {
	static ArrayList<Integer> arr;
	static int sum;
	
	public static void main(String[] args) {
		arr = new ArrayList<Integer>();
		sum = 0;
		for(int i = 0; i< 1001; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				arr.add(i);
				sum+= i;
			} else {
				//donothing
			}
		}
		System.out.println("The sum is: " + sum);
	}
}