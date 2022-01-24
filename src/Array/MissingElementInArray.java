package Array;

public class MissingElementInArray {

	public static void main(String[] args) {
		int [] arr = {1,5,7,15};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr[i]+1; j < arr[i+1]; j++) {
				System.out.print(j+ " ");
			}
		}
	}
}
