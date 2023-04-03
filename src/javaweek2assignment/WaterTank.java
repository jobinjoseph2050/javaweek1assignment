package javaweek2assignment;

import java.util.Scanner;


public class WaterTank {
	float c;
	int r;
	float i;
	String y;
	
	Scanner sc = new Scanner(System.in);
	
	void watertankfilling() {
		
		System.out.println("Enter the initial volume of water in the tank");
		
		i=sc.nextFloat();
		
		if(i<0 || i>100)
			
		{
			System.out.println("Invalid initial volume. Volume of water in tank can be only from 0 to 100");
		}
		
		//System.out.println("Start filling the tank one bucket at a time unless specified");
	
		for(c=i; c<=100 && c>=0; c+=10)
		{
		   
			if(c<=90 && c>=0)
			{
		    	//System.out.println("Tank is now filled to " + c + "Litres");
		    	
		    	System.out.println("Fill the tank with one bucket of water and press Y ");
		    	
		    	y=sc.next();
		    	
		    	float a = c+10;
		    	
		    	System.out.println("Tank is now filled to " + a  + "Litres");
		    	
		    	if(a==100)
		    		
		    		{System.out.println("Do not fill again, tank is full");
		    		
		    		break;
		    		}
		    	
			}
			
		    else if (c>90 && c<100)
			{
				System.out.println("Tank filled to " + c + "L");
				
				float m = c%10;
				
				float r=10-m;
				
				System.out.println("Fill " +  r + "liters of water to fill the tank and press Y");
				
				y=sc.next();
				
				System.out.println("Tank is now filled to 100 Litres");
			}
		    
			else if (c==100)
				
			{
				System.out.println("Do not fill again, tank is full");
			}
		    
			
	}
		
			
			
}

}


