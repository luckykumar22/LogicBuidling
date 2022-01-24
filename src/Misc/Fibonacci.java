package Misc;

public class Fibonacci {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13,21
		
		// first print the first two values 
		long n1=0,n2=1;
		long n3;
		System.out.print(n1+ " "+ n2 +" ");
		
		// swap n2 into n1 than n3 into n2 in the loop
		//finally print n3
		for (int i = 2; i <=50; i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3 + " ");
		}

	}

}
