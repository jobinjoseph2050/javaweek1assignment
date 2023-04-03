package javaweek2assignment;

import java.util.Scanner;



public class ChocolateBox {

	Scanner sc = new Scanner(System.in);
	
	int i;
	int num;
	String y;
	int totalchoc;
	
	void chocoadder() {
		
		System.out.println("Enter the initial number of chocolates in the box");
		
		i=sc.nextInt();
		
		if(i==27)
		
		{
			for(i=27;i<=63;i+=5)
			
		{
			
			totalchoc=i+5;
			
			if(totalchoc>63)
				
				{
				
				System.out.println("Cannot add another 5 chocolates as the total chocolates will go above 63");
				
				break;
				
				}
			
			System.out.println("Fill 5 chocolates and press Y");
			
			y=sc.next();
			
			System.out.println("Total chocolates are now " + totalchoc);
			
			
		}
		
		
		}
		
		else
			
		{
			System.out.println("Initial number of chocolates has to be made 27 before you can add chocolates");
		}
		
		
	
	}
}
