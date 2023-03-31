package loopexample;

import java.util.Scanner;


public class ForLoopExample {

	
	int actualPIN = 1234;
	int enteredPIN;
	int withdrawAmount;
	int availablebalance;
	int overdraft;

	Scanner sc = new Scanner(System.in);

	void checkPinIsCorrect() {
		for (
				int counter = 1; 
				counter <= 3; 
				counter++) 
		{
			System.out.println("Enter the PIN");
			enteredPIN = sc.nextInt();
			if (actualPIN == enteredPIN) {
				System.out.println("Entered PIN is correct");
				System.out.println("Enter the amount to be withdrawn:");
				withdrawAmount = sc.nextInt();
				if(withdrawAmount<=availablebalance || withdrawAmount<=overdraft)
				{
					System.out.println("Cash withdrawn in amount of: "+withdrawAmount);
				}
				
				else
					System.out.print("Insufficient balance");
				
				break;
				
			} else {
				
				System.out.println("Entered PIN is incorrect");
				
				while(counter==3)
				{
				System.out.print("card locked");
				break;
				}
				
				
			
			}
		}
	}
}
