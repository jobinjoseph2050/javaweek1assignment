package driverlicense;

public class Driverlicensemain {

	public static void main(String[] args) {
		
		Driverlicensedecision applicant1 = new Driverlicensedecision();
		
		applicant1.age = 20;
		applicant1.currentlicense="G";
		applicant1.monthsafterG1 = 12;
		
		if(applicant1.age>=16)
		{
			if(applicant1.currentlicense == "")
			{
				applicant1.G1decisionmaker();
			}
			else
			{ 
				if(applicant1.currentlicense == "G1")
					
				{
					if(applicant1.monthsafterG1>=12)
					{
						applicant1.G2decisionmaker();
					}
					
					else
					{
						System.out.print("WAIT TILL 12 MONTHS COMPLETED AFTER G1 TO TAKE G2");
					}
				}
				
				else
					
					if(applicant1.currentlicense == "G2")
					{
						applicant1.Gdecisionmaker();
					}	
			}
		}
		else
			
		{
			System.out.println("NOT ELIGIBLE FOR LICENSE AT THIS TIME");
		}
	}
}

