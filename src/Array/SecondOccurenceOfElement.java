package Array;

import java.util.Scanner;

public class SecondOccurenceOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {5,1,5,84,686,45,121,514,99,676,5,22};
		System.out.println("Enter number to check its next occurence");
		int next = sc.nextInt();
		System.out.println(second(arr,next));

	}



	private static int second(int[] arr, int next) {
		int count = 0;
		int i;
		for ( i= 0; i < arr.length-1; i++) {
			if(next==arr[i])
				count++;
			if(count==2)
				return i+1;

		}
		return -1;

	}

}
