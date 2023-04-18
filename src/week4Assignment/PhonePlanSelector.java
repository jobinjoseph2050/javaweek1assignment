package week4Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class PhonePlanSelector {

	String phone;
	int i;
	int k;
	String model;
	String selectedModel;
	int tabPrice;

	String[] samsungModels = { "S22", "S22+", "S22 ULTRA", "S22FE" };

	int[] samsungTabPrice = { 25, 35, 55, 20 };

	String[] appleModels = { "IPhone 14", "IPhone 14 pro", "IPhone 14 pro max", "IPhone 14 pro" };

	int[] monthlyAppleTabPrice = { 30, 40, 65, 25 };

	String[] phoneNetworks = { "Rogers", "Bell", "Telus" };

	int[] phoneNetworksPrice = { 70, 80, 75 };

	Scanner sc = new Scanner(System.in);

	PhonePlanSelector() {

	}

	String phoneModelSelector(String brand) {

		System.out.println("Please enter the model you want to buy from below");

		if (brand.equals("samsung")) {

			System.out.println(Arrays.toString(samsungModels));

		}

		else if (brand.equals("apple")) {

			System.out.println(Arrays.toString(appleModels));

		}

		else {
			System.out.println("INVALID ENTRY");
		}

		String selectedModel = sc.nextLine();

		return selectedModel;

	}

	String phoneNetworkSelector() {

		System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");

		String selectedNetwork = sc.nextLine();
		for (k = 0; k < phoneNetworks.length; k++) {
			if (phoneNetworks[k].equals(selectedNetwork)) {
//				System.out.println(phoneNetworks[k]);
				break;
			}

		}

		return phoneNetworks[k];

	}

	void planBreakDown(String brand, String selectedPhoneModel, String selectedPhoneNetwork) {

		int tabPrice = 0;
		if (brand.equals("samsung")) {
			for (i = 0; i < samsungModels.length; i++) {
				if (samsungModels[i].equals(selectedPhoneModel)) {
//					System.out.println(samsungModels[i]);

					tabPrice = samsungTabPrice[i];

					break;
				}
			}
		}

		else if (brand.equals("apple")) {
			for (int j = 0; j < appleModels.length; j++) {
				if (appleModels[j].equals(selectedPhoneModel)) {

					tabPrice = monthlyAppleTabPrice[j];

					break;

				}
			}
		}
		for (k = 0; k < phoneNetworks.length; k++) {
			if (phoneNetworks[k].equals(selectedPhoneNetwork)) {
				break;
			}
		}

		int totalMonthlyAmount = tabPrice + phoneNetworksPrice[k];

		System.out.println("You have selected " + selectedPhoneModel + " with " + selectedPhoneNetwork);

		System.out.println("Your Phone Tab will be:$" + tabPrice);

		System.out.println("Your Monthly Plan will be:$" + phoneNetworksPrice[k]);

		System.out.println("Total Monthly Amount :$" + totalMonthlyAmount);

	}

}
