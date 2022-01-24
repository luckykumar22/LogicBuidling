package Array;

public class PrintMissingElements {

	public static void main(String[] args) {
		int [] arr = {8, 15, 21, 24, 30, 37};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr[i]+1; j < arr[i+1]; j++) {
				System.out.print(j+ " ");
			}
		}

	}

}
