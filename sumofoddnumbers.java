package javaTraining;

public class sumofoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=100;i+=2) {
			count+=i;
		}
		System.out.println("The sum of the odd numbers 1-100 is: "+count);
	}

}
