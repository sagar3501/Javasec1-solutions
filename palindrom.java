package javaTraining;


import java.util.*;

public class palindrom {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = s.nextInt();
		int k=num;
		int rev=0;
		while(k>0) {
			int n=k%10;
			rev=rev*10+n;
			k/=10;
		}
		if(num==rev) {
			System.out.println("The number "+num+" is a palindrome");
		}
		else {
			System.out.println(num+" is not a palindrome");
		}
		s.close();
	}
}