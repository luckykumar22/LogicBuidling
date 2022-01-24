package SortingSearching;

public class BubbleSort {

	public static void main(String[] args) {
		int temp;
		int [] arr = {85,45,9,02,784,356,14,12,84,36};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
