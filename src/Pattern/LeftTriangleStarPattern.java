package Pattern;

public class LeftTriangleStarPattern {   
	public static void main(String args[])   
	{    
		/*//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j, row = 6;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
			//inner loop work for space      
			for (j=2*(row-i); j>=0; j--)         
			{  
				//prints space between two stars      
				System.out.print(" ");   
			}
			//inner loop for columns  
			for (j=0; j<=i; j++ )   
			{   
				//prints star      
				System.out.print("* ");   
			}
			//throws the cursor in a new line after printing each line  
			System.out.println();   
		}*/



		int i;
		for(i=1;i<=5;i++)
		{
			
			int cnt = 0;
			for(int j = 1;j<=i;j++)

			{
				System.out.print(cnt);
				cnt = cnt + 1;   
			}
			if(cnt == 10)
				cnt = 0; 
			System.out.println();

		}

	}
}







