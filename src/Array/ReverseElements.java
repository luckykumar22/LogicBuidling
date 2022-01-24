package Array;

import java.util.Scanner;

public class ReverseElements {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements in the arrays are");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\nReverse array elements are");
		
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+ " ");
			
		}


	}

}
