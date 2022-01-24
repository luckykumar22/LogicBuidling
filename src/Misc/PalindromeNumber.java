package Misc;

public class PalindromeNumber {

	public static void main(String[] args) {

		// 10102
		// mod of 10101 rem=2
		// divide 10101 quo=1010
		// 1010*10 +rem== 10100+2= 10102
		//20101



		int n=451;
		int rev = 0;
		int temp = n;
		while(n>0) {
			int mod = n%10;
			rev= rev*10 + mod;
			n = n/10;

		}
		System.out.println(rev);
		if(temp==rev) System.out.println("palindrome");

		else System.out.println("Not");

	}

	
}
