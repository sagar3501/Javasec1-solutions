package javaTraining;

import java.util.*;

public class amstrongnumbersbetween1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner se=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit=se.nextInt();
		for(int i=0;i<=limit;i++) {
			int sum=0;
			int k=i;
			while(k>0) {
				int d=k%10;
				sum+=(d*d*d);
				k/=10;
			}
			if(i==sum) {
				System.out.println(i);
			}
		}
		se.close();
	}

}
