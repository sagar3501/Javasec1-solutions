package javaTraining;

import java.util.*;

public class SumOfDigitsOfNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int k = s.nextInt();
		int sum=0;
		int sa=k;
		while(sa>0) {
			sum+=sa%10;
			sa/=10;
		}
		System.out.println("The sum of digits of the number "+k+" is: "+sum);
		s.close();
	}
}
