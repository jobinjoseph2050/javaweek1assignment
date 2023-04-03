package javaweek2assignment;

import java.util.Scanner;

public class IsNumberPrime {
	
	int num;
	
	Scanner sc = new Scanner(System.in);
	
	void primeTester() {
		
		System.out.println("Enter a positive integer");
		
		num=sc.nextInt();
		
		
		if(num==2)
			
		{System.out.println("Number is prime");
		}
		
		else if(num==1)
		{
			System.out.println("Number is neither prime or composite");
		}
		
		else if(num!=2 && num>=2 )
		{
			
			
			int r = num%2;
			
			if(r==0)
				
			System.out.println("Number is not prime");
			
			else
				
			System.out.println("Number is prime");
		}
		
		else
			
		{ System.out.println("invalid number");
		}
		
	}}

	


