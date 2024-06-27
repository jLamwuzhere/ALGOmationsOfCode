package conditionalRendering_MultiplyOrReturn0ForSchoolPaperwork;

							// GOAL
//GIVEN 2 INTS, IF EITHER IS BELOW ZERO, RETURN ZERO. OTHERWISE RETURN THE MULTIPLICATION OF THE 2 INTS.
//							THE SCENARIO IS PRINTING PAPERS FOR A SCHOOL


public class SchoolPaperwork {
//	//-------------METHOD 1 - TERNARY-----------
	public static int paperWork(int n, int m) {
		System.out.println(m<0 || n <0 ? 0 : m*n);
			    // check //return 0 // return m*n
		return m<=0 || n <=0 ? 0 : m*n;
	}
	
	
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
		paperWork(5, 0);
		paperWork(100, 12);
		paperWork(1, 1);
	}
}
