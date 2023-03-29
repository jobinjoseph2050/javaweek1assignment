package largestnum;

public class Largestnum {
	
	int num1;
	int num2;
	int num3;
	
	void findlargest() {
		if (num1 > num2)
		{
			if (num1>num3)
			{ 
				
				System.out.println("largest among " + num1 + "," + num2 + " and " + num3 + " is " + num1 );
				
			}
			
			else
			{
				System.out.println("largest among " + num1 + "," + num2 + " and " + num3 + " is " + num3 );
			}
			
				
		}
		
		else
		{
			if (num2 > num3) 
			{
				System.out.println("largest among " + num1 + "," + num2 + " and " + num3 + " is " + num2);               
			}
			
			else
				
			{ 
				System.out.println("largest among " + num1 + "," + num2 + " and " + num3 + " is " + num3);
			}
			
		}
			
			
	}

}
