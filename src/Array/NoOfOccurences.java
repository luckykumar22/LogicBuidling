package Array;

import java.util.Scanner;

public class NoOfOccurences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {5,1,5,84,686,45,121,514,99,676,5,22};
		System.out.println("enter a number");
		int next = sc.nextInt();
		System.out.println(noofoccurence(arr,next));
	}

	private static int noofoccurence(int[] arr, int next) {
		int count=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(next==arr[i])
				count++;
		}
		return count;
	}

}
