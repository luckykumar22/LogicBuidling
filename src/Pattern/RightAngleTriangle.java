package Pattern;

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();*/
		
		// first for is  for the row
		for (int i = 0; i < 5; i++) {
			// second for is  for the column
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			// come out with a new line
			System.out.println();
		}

	}

}

/*
Output

*
**
***
****
*****
     
*/
