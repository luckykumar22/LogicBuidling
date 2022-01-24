package Array;

public class CountDigits {

	public static void main(String[] args) {
		int n = 124578;
		int sum = 0;
		int l;
		System.out.println(n);
		int count = 0;
		while(n!=0) {
			l = n%10;//7
			sum += l;// 0+8+7
			n=n/10;// 12457
		}
		/*while(n!=0) {
			n = n/10;
			//	sum =sum +l;
			count++;
		}*/
		//System.out.println(count);
		System.out.println(sum);
	}

}
