package javaTraining;
import java.util.*;
public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner se = new Scanner(System.in);
		int num=se.nextInt();
		String num2 = Integer.toString(num);
		String x="";
		char r;
		for(int i=0;i<=num2.length();i++) {
			r=num2.charAt(i);
			x=r+x;
		}
		if(x==num2) {
			System.out.println(num+" is a palindrome");
		}
		else {
			System.out.println(num+" is not a palindrome");
		}
	}

}
