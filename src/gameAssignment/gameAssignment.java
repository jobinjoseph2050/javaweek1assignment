package gameAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class GameAssignment {

	String name;
	int i;
	int index = -1;

	int lengthCalculator(String name) {
		int size = name.length();
		System.out.println("Name has " + size + " characters");
		return size;
	}

	void guessTheName(int size, String name) {

		int numberOfWrongAttempts = 0;
		String guessLetter = "";
		String guessedCharactersString = new String(new char[size]).replace('\0', '*');
		System.out.println("You are guessing : " + guessedCharactersString);
		char[] nameCharacters = guessedCharactersString.toCharArray();
		ArrayList<String> wrongGuessLetters = new ArrayList<>();

		while (numberOfWrongAttempts < 5) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Guess the Next Character;number of Wrong guesses is :" + numberOfWrongAttempts);
			guessLetter = input.next();

			if (name.contains(guessLetter)) {
				System.out.println("Guessed character present in the name");
				int index = name.indexOf(guessLetter);
				nameCharacters[index] = guessLetter.toCharArray()[0];
				guessedCharactersString = String.valueOf(nameCharacters);
				System.out.println(guessedCharactersString);
				input.close();

			if(name.equals(guessedCharactersString)) {
				System.out.println("You win! You have guessed " + name + " correctly");
				break;

			}
			
			}

			else {
				numberOfWrongAttempts++;
				wrongGuessLetters.add(guessLetter);
				System.out.println("You have guessed (" + numberOfWrongAttempts + ") wrong letter:" + wrongGuessLetters);
				if(numberOfWrongAttempts==5)
				{
					System.out.println("You lost. Try again");
				}
				
			}

		}
		
		

	}

}
