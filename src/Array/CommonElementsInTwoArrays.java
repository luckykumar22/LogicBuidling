package Array;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
		int arr [] = {12, 13, 23, 15, 11, 16};
		int brr [] = {53, 12, 23, 15, 18, 13};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < brr.length; j++) {
				if (arr [i] ==brr [j])
				{
				System.out.print(arr [i]+" ");

				}
			}
		}

	}

}
