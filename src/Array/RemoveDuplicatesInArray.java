package Array;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int [] arr = {1,1,2,4,6,6,4,8,10};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j <= arr.length-1; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=0;
				}

			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
				count++;
		}

		int j = 0;
		int brr [] = new int[count];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				
				brr[j]=arr[i];
				j++;
			}
		}
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}

	}

}
