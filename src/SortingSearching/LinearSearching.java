package SortingSearching;

import java.util.Scanner;

public class LinearSearching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 5, 2, 4, 53, 4, 5, 41, 45 };
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				System.out.println("Found " + arr[i] + " at "+ (i+1));
			}
		}

	}
}
