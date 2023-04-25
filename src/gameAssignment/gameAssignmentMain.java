package gameAssignment;


public class GameAssignmentMain {

	public static void main(String[] args) {
		
		GameAssignment player = new GameAssignment();			
		int n = player.lengthCalculator("jobin");
		player.guessTheName(n, "jobin");

	}

}
