package Array;

public class FirstBigSeconfBigElement {

	public static void main(String[] args) {
		int [] arr = {5,1,54,84,25,686,45,121,514,99,676,158,22};
		int fBig= arr[0];
		int sBig= arr[1];
		for (int i = 1; i < arr.length-1; i++) {
			if(fBig<arr[i]) {
				sBig = fBig;
				fBig=arr[i];
			}
			else if(sBig<arr[i]) {
				sBig = arr[i];
			}
			
		}
		System.out.println(fBig);
		System.out.println(sBig);
	}
}
