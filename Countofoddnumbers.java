package javaTraining;

import java.util.*;

public class Countofoddnumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int k=s.nextInt();
		int count=0;
		for(int i=1;i<=k;i++) {
			if(i%2!=0) {
				count++;
			}
		}
		System.out.println("The count of odd numbers from 1 to "+k+" is: "+count);
		s.close();
	}

}
