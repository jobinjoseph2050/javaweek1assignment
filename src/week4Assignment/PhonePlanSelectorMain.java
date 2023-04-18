package week4Assignment;

import java.util.Scanner;

public class PhonePlanSelectorMain {

	public static void main(String[] args) {
		
//		String[] applemodels = { "IPhone 14", "IPhone 14 pro", "IPhone 14 pro max", "IPhone 14 pro" };
		
		PhonePlanSelector newCustomer = new PhonePlanSelector();
		
		newCustomer.k=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the Brand that you want to choose from: apple/ samsung");
		
		String brand = sc.nextLine();
		
		String selectedPhoneModel = newCustomer.phoneModelSelector(brand);
		
		String selectedPhoneNetwork= newCustomer.phoneNetworkSelector();
		
	
		newCustomer.planBreakDown(brand,selectedPhoneModel, selectedPhoneNetwork);
			
		
		sc.close();

	}

}
