package String;

public class CountVowelAndConsonant {

	public static void main(String[] args) {
		String s ="sljdpiaeraskjo aiusoiasinlkj";
		int ccount = 0 ,vcount = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				vcount++;
			}

			else if(s.charAt(i)>'a' && s.charAt(i)<'z')

				ccount++;	
		}
		
		System.out.println(s.length());
		System.out.println(vcount);
		System.out.println(ccount);

	}

}
