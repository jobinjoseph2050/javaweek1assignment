package week4Assignment;

public class PizzaShop {

	float price;
	int[] pizzaBasicPrice = { 15, 20, 25 };
	boolean needExtraCheese;
	boolean needPepperoni;

	float basicPizzaPrice(String pizzaSize) {

		float price = 0;

		if (pizzaSize.contentEquals("small"))

		{
			price = pizzaBasicPrice[0];
		}

		if (pizzaSize.contentEquals("medium"))

		{
			price = pizzaBasicPrice[1];
		}

		if (pizzaSize.contentEquals("large"))

		{
			price = pizzaBasicPrice[2];
		}

		return price;

	}

	float finalPrice(String pizzaSize, boolean needExtraCheese, boolean needPepperoni, float price) {

		if (needExtraCheese) {
			price += 1;
		}

		if (needPepperoni) {
			if (pizzaSize.contentEquals("small")) {
				price += 1;
			} else {
				price += 2;
			}

		}

		return price;

	}

}
