package string_EndsWithCheck;

public class StringEndsWith {
//	//-------------METHOD 1 - TERNARY FUNCTION USING ENDSWITH -----------
//	public static boolean solution(String str, String ending) {
//		System.out.println(str.endsWith(ending) ? true : false);
//		return str.endsWith(ending) ? true : false;
////		// Just checking to see if it contains something instead.
////		System.out.println(str.contains(ending) ? true : false);
////		return str.contains(ending) ? true : false;
//	  }

	
//	//-------------METHOD 2 - COMPARE CHARACTERS -----------
	public static boolean solution(String str, String ending) {
		System.out.println("------------------------------------------------");
		// Set a variable for the ending pointer to point at the end of ending string.
		int endingPointer = ending.length()-1;
		// Check first if the comparison string "ending" is longer than "str"
		if(ending.length()==0) {
			System.out.println("Technically still a match so true, but you shouldn't send empty Strings... :-/");
			return true;
		}
		if(str.length()<ending.length()) {
			// If so, we can immediately return false.
			System.out.println("Not a match. Check the lengths lol! :-(");
            return false;
		}
		// Run a for loop going backwards in our main "str" String.
	    for (int i = str.length() - 1; i >= 0; i--) {
	    	// Declare our pointer position and the character it at.
        	System.out.println("str - position: " + i +", char: " + str.charAt(i));
        	// Declare our ending pointer character.
        	System.out.println("comparing with... ");
        	System.out.println("ending - position " + endingPointer + ", char: " + ending.charAt(endingPointer) + "...");
        	System.out.println("   ------------   ");
            if (str.charAt(i) != ending.charAt(endingPointer)) {
            	System.out.println("***************** Not a match. :-( *****************");
                return false;
            }
            if(endingPointer == 0) {
            	System.out.println("***************** Match! *****************");
            	return true;
            }
            else{
            	endingPointer--;
            }
	    }
	    System.out.println("***************** Match! *****************");
	    return true;
	}
	
	
//	//-------------METHOD 3 - COMPARE CHARACTERS WITH COMBINED LOOP-----------
//	public static boolean solution(String str, String ending) {
//		if(str.length()<ending.length()) {
//			System.out.println("false");
//            return false;
//		}
//		for (int i = str.length() - 1, j = ending.length() - 1; i >= 0 && j >= 0; i--, j--) {
//	    	System.out.println("String str: position " + i +", char: " + str.charAt(i));
//	        System.out.println("String ending: position " + j +", char: " + ending.charAt(j));
//	        if (str.charAt(i) != ending.charAt(j)) {
//	        	System.out.println("false");
//	        	return false;
//        	}
//	    }
//	    System.out.println("true");
//	    return true;
//	}
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
		solution("Jeff", "ff");
		System.out.println(" ");
		solution("Jeff", "Jeffery");
		System.out.println(" ");
		solution("Jeff", "1");
		System.out.println(" ");
		solution("Jeff", "J");
		System.out.println(" ");
		solution("Jeff", "Jeff");
		System.out.println(" ");
		solution("sumo", "omo");
		solution("", "greg");
	}

}
