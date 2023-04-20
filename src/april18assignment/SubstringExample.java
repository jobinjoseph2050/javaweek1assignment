package april18assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SubstringExample {

	int i;
	int index;

	String[] nameOfCities = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Missisauga", "Burlington",
			"Kingston", "Kitchener" };

	String[] citiesFoundEndingInTon = new String[4];

	void findCityName() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter city name");

		sc.close();

		String cityNameEntered = sc.nextLine();

		for (i = 0; i < nameOfCities.length; i++)

		{
			if (nameOfCities[i].equalsIgnoreCase(cityNameEntered)) {
				System.out.println("City Name found");
				break;

			}

		}

		if (i == nameOfCities.length) {
			System.out.println("City Name not found");
		}

	}

	void findCitiesEndingWithTon() {

		System.out.println("Cities ending with ton");

		for (int i = 0; i < nameOfCities.length; i++)

		{

			if (nameOfCities[i].endsWith("ton")) {

				System.out.println(nameOfCities[i]);

			}

		}

	}

	void replaceTonWithFun() {

		System.out.println("new name of cities");

		for (int i = 0; i < nameOfCities.length; i++)

		{

			if (nameOfCities[i].endsWith("ton"))

			{
				String newCityName = nameOfCities[i].replace("ton", "fun");

				System.out.println(newCityName);

			}

		}

	}
}
