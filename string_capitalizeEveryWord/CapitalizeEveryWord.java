package string_capitalizeEveryWord;

//import java.util.ArrayList;		//FOR METHOD 2

public class CapitalizeEveryWord {
//	//-------------METHOD 1 - NOT YET WORKING -----------
//	public static String capitalizeWords(String j){
//		StringBuilder capitalized = new StringBuilder(j);
//		System.out.println("Given: " + j);
//			if(j.isEmpty()) {
//				System.out.println("EMPTY!");
//				return j;
//			}
////			else if(j.charAt(1)!= ('a'|'b')) {
////				return null;
////			}
//			else {
//				for(int i=0; i<capitalized.length(); i++) {
//					if(i==0) {
//						j.replace('a', 'A').replace('b', 'B').replace('c', 'C');
////						'd', 'D'|'e', 'E'|'f', 'F'|'g', 'G'|'h', 'H'|
////								'i', 'I'|'j', 'J'|'k', 'K'|'l', 'L'|'m', 'M'|'n', 'N'|'o', 'O'|'p', 'P'|'q', 'Q'|
////								'r', 'R'|'s', 'S'|'t', 'T'|'u', 'U'|'v', 'V'|'w', 'W'|'x', 'X'|'y', 'Y'|'z', 'Z');
//					}
//					else if(j.charAt(i-1) == ' ') {
//						j.replace('a', 'A').replace('b', 'B').replace('c', 'C');
////						'd', 'D'|'e', 'E'|'f', 'F'|'g', 'G'|'h', 'H'|
////								'i', 'I'|'j', 'J'|'k', 'K'|'l', 'L'|'m', 'M'|'n', 'N'|'o', 'O'|'p', 'P'|'q', 'Q'|
////								'r', 'R'|'s', 'S'|'t', 'T'|'u', 'U'|'v', 'V'|'w', 'W'|'x', 'X'|'y', 'Y'|'z', 'Z');
//					}
//				}
//			}
////		System.out.println("Capitalized: " + capitalized.toString());
////		return capitalized.toString();
//			System.out.println("Capitalized: " + j);
//			return j;
//	}
//	//-------------METHOD 2 - ARRAY, TOUPPERCASE,  AND THEN BACK TO STRING - ALSO NOT WORKING YET-----------
//	public static String capitalizeWords(String j){
//		// PUT OUR STRING INTO A WORD ARRAY.
//		j.toCharArray();
//		ArrayList<String> wordArray = new ArrayList<String>();
//		System.out.println("Given: " + j);
//		String capitalized = new String();
//		return capitalized;
//	}
	
	
	
//	//-------------METHOD 3 - ???? -----------
	public static String capitalizeWords(String j) {
	    char[] chars = j.toCharArray();
	    boolean capitalizeNext = true;

	    for (int i = 0; i < chars.length; i++) {
	        if (Character.isWhitespace(chars[i])) {
	            capitalizeNext = true; // Set the flag to capitalize the next character
	        } else if (capitalizeNext) {
	            chars[i] = Character.toUpperCase(chars[i]); // Capitalize the character
	            capitalizeNext = false; // Reset the flag
	        }
	    }
	    System.out.println(chars);
	    return new String(chars); // Convert the char array back to a string
	}
	
//	//-------------MAIN METHOD -----------	
	public static void main(String[] args) {
		capitalizeWords("apple bay");
		capitalizeWords("hey bob");
		capitalizeWords("m");
		capitalizeWords("hi im george");
		capitalizeWords("4");
		capitalizeWords("hey bob");
	}

}
