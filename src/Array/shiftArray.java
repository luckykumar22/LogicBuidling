package Array;

public class shiftArray {

	public static void main(String[] args) {
		int [] arr = {4,5,1,1336,1,2,2,556,4,75};
		display(arr);
		System.out.println();
		leftRotate(arr);
		display(arr);
		System.out.println();
		rightRotate(arr);
		display(arr);
		System.out.println();
		leftShift(arr);
		display(arr);
		System.out.println();
		rightShift(arr);
		display(arr);
		System.out.println();
		/*delete(arr,5);
		display(arr);*/
//		search(arr,556);
//		System.out.println();
		
		insert(arr,5,3);
		display(arr);
		System.out.println();

	}

	private static void insert(int[] arr, int pos, int key) {
		int i;
		for(i=arr.length-1;i>=pos-1;i--) {
			arr[i]=arr[i-1];
		}
		arr[i]=key;
	}

	private static void search(int[] arr, int i) {
		// TODO Auto-generated method stub
		
	}

	private static void delete(int[] arr, int i) {
		int j;
		for(j=i-1;j<arr.length-1;j++) {
			arr[j]=arr[j+1];
			
		}
		arr[j]=0;
	}

	private static void rightRotate(int[] arr) {
		int j;
		int temp1=arr[arr.length-1];
		for (j = arr.length-1; j >0; j--) {
			arr[j]=arr[j-1];
		}
		arr[j]=temp1;
		
	}

	private static void leftRotate(int[] arr) {
		int j = 0,temp;
		temp=arr[j];
		for(j=0;j<arr.length-1;j++) {
			arr[j]=arr[j+1];
		}
		arr[j]=temp;
		
	}

	private static void rightShift(int[] arr) {
		//start from the far right till the beginning
		//when you reach at the start assign that zero to make it empty
		int j;
		for(j=arr.length-1;j>0;j--) {
			arr[j]=arr[j-1];
			
		}
		arr[j]=0;
		
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.print(arr[arr.length-1]);
		
	}

	private static void leftShift(int[] arr) {
		int i;
		for(i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[i]=0;
	}

}
