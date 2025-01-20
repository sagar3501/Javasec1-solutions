package javaTraining;

import java.util.*;

public class SumOfFirstnnNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int k = s.nextInt();
		int sum=0;
		for(int i=1;i<=k;i++) {
			sum+=i;
		}
		System.out.println("The sum of first "+k+" natural numbers is: "+sum);
		s.close();
	}
}
