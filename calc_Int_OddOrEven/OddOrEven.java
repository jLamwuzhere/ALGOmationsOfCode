package calc_Int_OddOrEven;


										//TARGET GOAL:
//Given an number, determine if it's odd or even and return "Even" or "Odd".
//EXAMPLE: 2 will return "Even".


public class OddOrEven {
//	//-------------METHOD 1 - TERNARY FUNCTION USING %2 -----------
	public static String evenOrOdd(int number) {
		System.out.println(number %2 == 0 ? "Even" : "Odd");
		return number %2 == 0 ? "Even" : "Odd";
    }
	
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
		evenOrOdd(0);
		evenOrOdd(1);
		evenOrOdd(2);
		evenOrOdd(3);
		evenOrOdd(4);
		evenOrOdd(5);
		evenOrOdd(8790);
	}
}
