package Array;

public class DuplicateElements {

	public static void main(String[] args) {
		int [] arr = {85,45,9,02,784,356,14,14,02,85,12,84,36};
		int [] brr = {};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+ " ");
				}
			}
		}

	}
	
}
