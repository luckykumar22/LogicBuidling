package Misc;

public class CountCharacter {

	public static void main(String[] args) {
		String s ="sdvdsdv fvzd sdvs" ; int count=0,count1=0;
		char f=' ';
		for (int i = 0; i <=s.length()-1; i++) {
			if(f==s.charAt(i))
				count++;
			
			if(s.charAt(i) != ' ')    
			{
				count1++;
			}

		}
		System.out.println(count+" "+count1);

	}
}