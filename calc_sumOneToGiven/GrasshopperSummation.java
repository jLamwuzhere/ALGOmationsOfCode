package calc_sumOneToGiven;

public class GrasshopperSummation {
//	//-------------METHOD 1 - FOR LOOP -----------
	public static int summation(int n) {
		int totalSumToNum = 0;
		System.out.println("Given: " + n);
		if(n <0) {
			System.out.println("THIS NUMBER IS NOT MORE THAN ZERO. CHEATER!");
		}
		else {
			for(int i = 1; i<=n; i++) {
				totalSumToNum +=i;
				System.out.println(" + " + i + " = " + totalSumToNum);
			}	
		}
		System.out.println("Sum from 0 to " + n + " is: " + totalSumToNum);
		return totalSumToNum;
	}
	
//	//-------------METHOD 2 - MATH TRICK - NO IF-ELSE CHECK FOR NEGATIVES-----------
//	public static int summation(int n) {
//		System.out.println("Given: " + n);
//		System.out.println("Answer: " + n*(n+1)/2);
//        return  n*(n+1)/2;
//    }
	
//	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		summation(1);
		summation(2);
		summation(5);
		summation(10);
		summation(-50);
	}
}
