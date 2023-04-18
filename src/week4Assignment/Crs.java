package week4Assignment;

import java.util.Scanner;

public class Crs {

	int score;

	int[] educationPoints = { 25, 23, 22, 21 };

	int eduPoints;

	int[] experiencePoints = { 13, 15 };

	int expPoints;
	
	boolean relativeInCanada;
	
	boolean studiedTwoYearsInCanada;
	
	boolean workedTwoYearsInCanadaNOC_OABC;
	
	Scanner sc = new Scanner(System.in);

	int educationPoints() {

		System.out.println("Enter the number against your highest education");

		System.out
				.println("1. PhD 2. Master's Degree 3. Two or more university degrees/diplomas 4. 12th+Degree/Diploma");

		int option = sc.nextInt();

		option -= 1;

		for (int i = 0; i < educationPoints.length; i++) {
			if (i == option) {
				eduPoints = educationPoints[i];
				break;
			}
		}

		return eduPoints;

	}

	int experiencePoints() {

		System.out.println("Enter the number against your highest education");
		System.out.println("1. 4-5 years 2. 6 years or more ");

		int option = sc.nextInt();

		option -= 1;

		for (int i = 0; i < experiencePoints.length; i++) {
			if (i == option) {
				expPoints = experiencePoints[i];
				break;
			}
		}
		return expPoints;
	}

	int agePoints() {

		int agePoints = 0;

		System.out.println("Enter the age");

		int age = sc.nextInt();

		if (age >= 18 & age <= 35) {
			agePoints = 12;
		}

		else

		{
			switch (age) {
			case 36:

				agePoints = 11;
				break;

			case 37:

				agePoints = 10;
				break;

			case 38:

				agePoints = 9;
				break;

			case 39:

				agePoints = 8;
				break;

			case 40:

				agePoints = 7;
				break;

			case 41:

				agePoints = 6;
				break;

			case 42:

				agePoints = 5;
				break;

			case 43:

				agePoints = 4;
				break;

			case 44:

				agePoints = 3;
				break;

			case 45:

				agePoints = 3;
				break;

			case 46:

				agePoints = 1;
				break;

			case 47:

				agePoints = 0;
				break;

			default:

				agePoints = 0;
					
				}

			}
		
		return agePoints;

		}

	

	float ieltsPoints() {
		
		float lPoints=0;
		float sPoints=0;
		float rPoints=0;
		float wPoints=0;
		
		System.out.println("Enter your IELTS Score for Listening:");
		
		float lScore = sc.nextInt();
		
		System.out.println("Enter your IELTS Score for Speaking:");
		
		float sScore = sc.nextInt();
		
		System.out.println("Enter your IELTS Score for Reading:");
		
		float rScore = sc.nextInt();
		
		System.out.println("Enter your IELTS Score for Writing:");
		
		float wScore = sc.nextInt();
		
		if(lScore>=8)
			
		{
			lPoints=6;
		}
		else if(lScore==7.5)
		{
			lPoints=5;
		}
		
		else 
		{
			lScore=0;
		}
		
		if(sScore>=7)
			
		{
			sPoints=6;
		}
		else if(sScore==6.5)
		{
			sPoints=5;
		}
		
		else 
		{
			sScore=0;
		}
		
		if(rScore>=7)
		{
			rPoints=6;
		}	
		
		else if(rScore==6.5)
		{
			rPoints=5;
		}
		
		else 
		{
			rScore=0;
		}
		
		if(wScore>=7)
		{
			wPoints=6;
		}	
		
		else if(wScore==6.5)
		{
			wPoints=5;
		}
		else
		{
			wScore=0;
		}
		
		float totalIeltsPoints= lPoints + sPoints + rPoints + wPoints;
		
		return totalIeltsPoints;
		
		
	}
	
	void finalScoreDisplay(int eduPoints, int agePoints, int ieltsPoints, float totalIeltsPoints) {
		
		
		float totalPoints= eduPoints+agePoints+ieltsPoints +totalIeltsPoints;
		
		System.out.println("Total Points you have scored: " + totalPoints);
		
		
		if(totalIeltsPoints>=67 )
		{
			System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}
		
		else
			
			{
			System.out.println("You do not qualify to submit an Expression of Interest (EOI) to Immigration Canada");
			}
}
	
}

