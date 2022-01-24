package Array;

import java.util.Scanner;

public class InsertElementByIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[]{1,2,3,4,5,6};
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}
		System.out.println("enter number and pos");
		int num=sc.nextInt();
		int pos=sc.nextInt();
		int i;
		for (i = arr.length-1; i >= pos-1;i--) {
			arr[i]=arr[i-1];
		}
		arr[i-1]=num;
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}
	}

}
