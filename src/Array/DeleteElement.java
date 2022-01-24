package Array;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("Enter index to be deleted");
		int pos =sc.nextInt();
		int i;
		for (i = pos-1; i >= arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}
	}
}
