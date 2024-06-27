package boolean_ToString;

								// GOAL
//GIVEN A BOOLEAN VALUE, RETURNN EITHER TRUE OR FALSE BASED ON THE RESULT.
//THE SCENARIO IS INTERPRETTING A BOOLEAN

public class BooleanToString {
//	//-------------METHOD 1 - TERNARY FUNCTION -----------
//	public static String convert(boolean b) {
//		System.out.println(b ? "True" : "False");
//		// Ternary - argument ? True condition : False condition
//		return b ? "True" : "False";
//	}
	
	
//	//-------------METHOD 2 - BOOLEAN TO STRING -----------	
  public static String convert(boolean b){
	  System.out.println(Boolean.toString(b));
	  return Boolean.toString(b);
  }
  
  
	// --------------MAIN METHOD--------------	
	public static void main(String[] args) {
		convert(true);
		convert(false);
		convert(true);
	}
}
