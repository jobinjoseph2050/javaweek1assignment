package javaweek2assignment;

import java.util.Scanner;

public class PivotAcademy {

	String EU;
	String EP;
	int i;
	
	Scanner sc = new Scanner(System.in);
	
	void userverification() {
		
		
		for(i=1;i<=3;i++)
		{
			String TU = "pivotAdmin";
			String TP = "Admin123";
			
			System.out.println("Enter the Username");
			
			EU=sc.next();
			
			System.out.println("Enter the Password");
			
			EP=sc.next();
			
			if(EU.equals(TU) && EP.equals(TP))
				
				{
				
				System.out.println("You are logged into the application");
				
				break;
				
				}
				
			else 
				
			{	
				if(i==3)
					
				{
					System.out.println("Incorrect User id or password. Account Locked");
					break;
				}
				
				System.out.println("Incorrect User id or password.Try again");
			}
				
			}
					
			}
		}
	



	
		
		
		
	
