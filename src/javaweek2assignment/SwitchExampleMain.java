package javaweek2assignment;

public class SwitchExampleMain {

	public static void main(String[] args) {
		
		String operation = "squar";
		SwitchExample calculator = new SwitchExample();
		calculator.num1 = 10;
		calculator.num2 = 4;

	
		switch (operation) {
		case "add":
			calculator.sumOfNumbers();
			break;
		case "subtract":
			calculator.differenceOfNumbers();
			break;
		case "multiply":
			calculator.productOFNumbers();
			break;
		case "divide":
			calculator.divisionOfNumbers();
			break;
		case "square":
			calculator.Squareofnumber();
			break;
		case "cube":
			calculator.cubeofnumber();
			break;	
			
		default:
			calculator.invalid();
		}
		
		

	}


	}


