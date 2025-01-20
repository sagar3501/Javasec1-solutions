package javaTraining;

import java.util.*;

class PrimeSum{
	public void sumofprimes(ArrayList<Integer> a) {
		int sum=0;
		for(int i=0;i<a.size();i++) {
			sum+=a.get(i);
		}
		System.out.println("The sum of the primes = "+sum);
	}
}

class PrimeAvg{
	public void avgofprimes(ArrayList<Integer> a) {
		int avg=0;
		for(int i=0;i<a.size();i++) {
			avg+=a.get(i);
		}
		System.out.println("The average of primes is = "+avg/a.size());
	}

	public void sumofprimes(ArrayList<Integer> primes) {
		// TODO Auto-generated method stub
		
	}
}
public class PrimeNumberSumAndAverage {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a limit = ");
		int limit=s.nextInt();
		ArrayList<Integer> primes =new ArrayList<>();
		int count=0;
		int num=2;
		while(limit>count) {
			if(isPrime(num)) {
				primes.add(num);
				count++;
			}
			num++;
		}
		System.out.print("The first "+limit+" prime numbers are : ");
		for(int i=0;i<primes.size();i++) {
			int p=primes.get(i);
			System.out.print(p+" ");
		}
		System.out.println();
		PrimeAvg sum = new PrimeAvg();
		sum.sumofprimes(primes);
		PrimeAvg avg = new PrimeAvg();
		avg.avgofprimes(primes);
		s.close();
	}
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i  <= num/2; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;  
    }

}
