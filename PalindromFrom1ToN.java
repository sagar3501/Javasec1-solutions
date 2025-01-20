package javaTraining;
import java.util.*;
public class PalindromFrom1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		for(int i=0;i<=num;i++) {
			int k=i;
			int rev=0;
			while(k>0) {
				int d=k%10;
				rev=rev*10+d;
				k/=10;
			}
			if(i==rev) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}