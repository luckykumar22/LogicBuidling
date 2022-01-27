package Array;

public class Merge2Arrays {

	public static void main(String[] args) {
		int arr [] = {12, 13, 23, 15, 11, 16};
		int brr [] = {53, 26, 23, 15, 18, 13};
		int j =0;
		int crr [] = new int[arr.length+brr.length];
		//System.out.println(crr.length);
		
		for (int i = 0; i < arr.length; i++) {
			crr[j] = arr[i];
			j++;
		}
		
		
		for (int i = 0; i < brr.length; i++) {
			crr[j]=brr[i];
			j++;
		}
		
		
		for (int i = 0; i < crr.length; i++) {
			System.out.print(crr[i]+ " ");
		}

	}

}
