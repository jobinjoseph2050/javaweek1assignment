package week4Assignment;

import java.util.Scanner;

public class PizzaShopMain {

	public static void main(String[] args) {

		PizzaShop order = new PizzaShop();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter pizza size ( small , medium, large)");

		String pizzaSize = sc.nextLine();

		float price =order.basicPizzaPrice(pizzaSize);

		float finalPrice = order.finalPrice(pizzaSize, true, false, price );
		
		System.out.println("Final price of your " +  pizzaSize  + " pizza : $" + finalPrice);

		sc.close();

	}

}
