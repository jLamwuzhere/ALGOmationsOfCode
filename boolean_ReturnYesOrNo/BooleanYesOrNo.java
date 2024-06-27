package boolean_ReturnYesOrNo;

public class BooleanYesOrNo {
		//	-------------METHOD 1-IF ELSE STATEMENT ------------
	public static String boolToWord(boolean b){
		if(b == true) {
			System.out.println("Yes");
			return "Yes";
		}
		else{
			System.out.println("No");
			return "No";
		}
	}
	
//	//	-------------METHOD 2 - TERNIARY------------
//	public static String boolToWord(boolean b) {
//	    // Use the ternary operator to return "Yes" if b is true, and "No" otherwise
//		System.out.println(b ? "Yes" : "No");
//	    return b ? "Yes" : "No";
//	}


	// --------------MAIN METHOD--------------
    public static void main(String[] args) {
    	boolToWord(true);
    	boolToWord(false);
    }
}
