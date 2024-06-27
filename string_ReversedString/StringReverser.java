package string_ReversedString;
public class StringReverser{
//	-------------METHOD 1 - REVERESED FOR LOOP -----------
	static String reverse(String str){
		StringBuilder reversedString = new StringBuilder();
		if(str.length()==0){
			System.out.println("Error! String must be at least 2 chars");
				return null;
		}
		else if(str.length()==1){
			System.out.println("Error! String must be at least 2 chars");
			System.out.println("Your string: " + str);
			return str;
		}
		else{
		for(int i=str.length()-1; i>=0; i--){
			reversedString.append(str.charAt(i));
			}
			System.out.println(reversedString.toString());
			return reversedString.toString();
		}
	}
//	-------------METHOD 2 - RECURSION ----------- 
	static String recursiveReverse(String str) {
		// Checks if the string is empty
		if (str.isEmpty()) {
		    return str;
		} else {
		    // Recursively calls the method with the substring excluding the first character,
		    // then appends the first character to the end of the reversed substring.
		    String reversedSubstring = recursiveReverse(str.substring(1));
		    StringBuilder reversed = new StringBuilder(reversedSubstring);
		    reversed.append(str.charAt(0));
		    System.out.println("Reversed string: " + reversed.toString());
		    return reversed.toString();
		}
	}   
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
//		reverse("Welcome!");
//		reverse("");
//		reverse("W");
		recursiveReverse("Welcome!");
	}
}
