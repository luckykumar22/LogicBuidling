package Misc;

public class Factorial {
	public static void main(String[] args) {
		/*4! = 4*3*2*1 = 24  
		5! = 5*4*3*2*1 = 120*/
		int fact = 1;
		for (int i = 5; i > 0; i--) {
			fact =fact*i;
		}
		System.out.println(fact);
	}
}