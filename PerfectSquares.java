package javaTraining;
public class PerfectSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double k=80;
	    double root =Math.sqrt(k);
	    double num = Math.pow(root, 2);
	    if(num==k) {
	    	System.out.print(k+" is a Perfect Square");
	    }
	    else {
	    	System.out.print(k+" is Not a perfect Square");
	    }
	}

}
