package conditionalRendering_CalculateBMI;

public class CalculateBMI {
////-------------METHOD 1 - IF STATEMENTS------------
//						Weight is in pounds?		Height is in meters.
	public static String bmi(double weight, double height) {
//			variable calcBmi		calculated by weight divided by height squared
		double calcBmi = weight / (height*height);
		System.out.println(calcBmi);
		if(calcBmi <= 18.5) {
			System.out.println("Underweight");
			return "Underweight";
		}
		else if(calcBmi<= 25.0) {
			System.out.println("Normal");
			return "Normal";
		}
		else if (calcBmi <=30.0) {
			System.out.println("Overweight");
			return "Overweight";
		}
		else {
			System.out.println("Obese");
			return "Obese";
		}
	}
	
	
////-------------METHOD 2 - CLEANER VERSION, BUT MUTUALLY EXCLUSIVE CHECKS------------
//	public static String bmi(double weight, double height) {
//	    
//		  double bmi = weight / (height * height);
//
//			if ( bmi <= 18.5) return "Underweight";
//			if ( bmi <= 25) return "Normal";
//			if ( bmi <= 30) return "Overweight";
//			return "Obese";
//	}
	
	
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
        bmi(180, 2.8);
        bmi(90, 2.8);
        bmi(900, 2.8);
        bmi(200, 2.8);
        bmi(150, 2.8);
        bmi(130, 2.8);
    }
}
