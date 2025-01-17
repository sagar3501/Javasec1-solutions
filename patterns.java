package javaTraining;

public class patterns {

	public static void main(String[] args) {
		int k=5;
		for(int i=k;i>=0;i--) {
			for(int j=0;j<=k-i;j++) {
				System.out.print(" ");
			}
			for(int l=0;l<(2*i-1);l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
