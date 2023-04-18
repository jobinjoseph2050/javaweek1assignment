package week4Assignment;

public class CrsMain {

	public static void main(String[] args) {
		
		
		Crs candidate = new Crs();
		
		int eduPoints = candidate.educationPoints();
		
		int expPoints = candidate.experiencePoints();
		
		int agePoints = candidate.agePoints();
		
		float totalIeltsPoints = candidate.ieltsPoints();
		
		candidate.studiedTwoYearsInCanada = true;
		candidate.workedTwoYearsInCanadaNOC_OABC = true;
		
		
		candidate.finalScoreDisplay(eduPoints, expPoints, agePoints, totalIeltsPoints );
		
		
		

	}

}
