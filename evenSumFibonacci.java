package main;
import java.util.*;

public class evenSumFibonacci {
	static ArrayList<Integer> fib;
	static int sum, i, length;
	
	public static void main(String[] args) {
		fib = new ArrayList<Integer>();
		fib.add(0);
		fib.add(1);
		sum = 0;
		i = 0;
		do {
			int num = fib.get(i) + fib.get(i + 1);
			fib.add(num);
			i++;
		} while (fib.get(i + 1) <= 4000000);
		length = fib.size();
		for (int j = 0; j < length; j++) {
			int num = fib.get(j);
			if (num % 2 == 0) {
				sum += fib.get(j);
			}
		}
		System.out.println(fib.get(i));
		System.out.println(sum);
	}
}
