package regex_ValidatePinCode;

public class RegexPinValidation {
//	//-------------METHOD 1 - CHECK LENGTH THEN DIGITS -----------
//	public static boolean validatePin(String pin) {
//		// Check to see if it's either 4 or 6 digits.
//		if (pin.length() != 4 && pin.length() != 6) {
//			// Print and return false if not
//	    	System.out.println("false");
//	    	return false;
//	    }
//		// Iterate through the pin from beginning to end.
//		for(int i=0;i<pin.length(); i++) {
//			// Check each char in the string to ensure it is NOT a number.
//			if (!Character.isDigit(pin.charAt(i))) {
//				// If there are any chars that aren't 0-9, print and return "false".
//				System.out.println("false");
//				return false;
//			}
//		}
//		// If these both pass, it's legit, so print and return "true".
//	    System.out.println("true");
//	    return true;
//	}
	
	
//	//-------------METHOD 2 - REGEX FOR LENGTH AND DIGITS -----------
	public static boolean validatePin(String pin) {
		// d should mean digits while 4 and 6 show the size requirements. The single bar | is an OR statement.
		System.out.println(pin.matches("\\d{4}|\\d{6}"));
	    return pin.matches("\\d{4}|\\d{6}");
	  }
	
	
	// --------------MAIN METHOD--------------
    public static void main(String[] args) {
    	validatePin("12345");
    	validatePin("aa45");
    	validatePin("123456");
    	validatePin("2345");
    	validatePin("004A");
    }
}
