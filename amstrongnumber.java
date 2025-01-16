package javaTraining;

import java.util.*;

public class amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner se = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=se.nextInt();
		int sum=0;
		int k=num;
		while(k>0) {
			int d=k%10;
			sum+=(d*d*d);
			k/=10;
		}
		if(sum==num) {
			System.out.println(sum+" is an amstrong number");
		}
		else {
			System.out.println(num+" is not an amstrong number");
		}
		se.close();
	}

}
