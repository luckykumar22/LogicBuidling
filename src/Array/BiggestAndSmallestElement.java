package Array;

public class BiggestAndSmallestElement {

	public static void main(String[] args) {
		int [] arr = {5,1,54,84,25,686,45,121,514,99,676,158,22};
		int big=arr[0];
		int small=arr[1];
		for (int i = 1; i < arr.length-1; i++) {
			if(big<arr[i]) {
				big=arr[i];
			}
			if(small>arr[i])
				small=arr[i];
		}
		System.out.println(big +" "+ small);

	}

}
