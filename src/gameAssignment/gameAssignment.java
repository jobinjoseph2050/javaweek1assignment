package gameAssignment;
import java.util.ArrayList;
import java.util.Scanner;
public class gameAssignment {

	String name;
	int i;
	int index=0;
	

	int lengthCalculator(String name) {
		int size = name.length();

		System.out.println("Name has " + size + " characters");

		return size;
	}

	void guessWork(int size, String name) {
		
		int numberOfWrongAttempts=0;
		String guessLetter = "";
		String guessedCharactersString = new String(new char[size]).replace('\0', '*');
//		String p = guessedCharactersString;
		System.out.println("You are guessing : " + guessedCharactersString);
		char[] nameCharacters = guessedCharactersString.toCharArray();
		
		
		while(numberOfWrongAttempts<=10)
		{	
		Scanner input = new Scanner(System.in);	
		ArrayList<String> wrongGuessLetters = new ArrayList<>();
		System.out.println("Guess the Next Character;number of Wrong guesses is :"+numberOfWrongAttempts);
		guessLetter =input.next();
		
		
		if(name.contains(guessLetter))
		{
			int index = name.indexOf(guessLetter);
			nameCharacters[index] = guessLetter.toCharArray()[0];
			guessedCharactersString = String.valueOf(nameCharacters);
			
		}
		
		else if(name.equals(guessedCharactersString)){
            System.out.println("You win! You have guessed "+name+ " correctly");
             break;
			
		}	
		
		else
		{	wrongGuessLetters.add(guessLetter);		
		}
			
		System.out.println("You have guessed (" + numberOfWrongAttempts + ") wrong letter:" + wrongGuessLetters );
		numberOfWrongAttempts++;
			
		}
		

	}

	}
		
		
	
		 
		
	
	
	
	
	


