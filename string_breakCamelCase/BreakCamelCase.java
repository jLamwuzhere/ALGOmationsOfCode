package string_breakCamelCase;
//import java.util.Arrays;	//FOR METHOD 2

public class BreakCamelCase {
//	//-------------METHOD 1 - BRUTE FORCE CONDITIONAL -----------
//	public static String camelCase(String input) {
//		StringBuilder spacedString = new StringBuilder();
//		System.out.println("String given: " + input);
//		if(input.length()==0) {
//			System.out.println("EMPTY!!!!");
//			System.out.println("Try again.");
//			return input;
//		}
//		for(int i=0; i<input.length(); i++) {
//			if(input.charAt(i)== 'A'|input.charAt(i)== 'B'|input.charAt(i)== 'C'|input.charAt(i)== 'D'|input.charAt(i)== 'E'|
//					input.charAt(i)== 'F'|input.charAt(i)== 'G'|input.charAt(i)== 'H'|input.charAt(i)== 'I'|input.charAt(i)== 'J'|
//					input.charAt(i)== 'K'|input.charAt(i)== 'L'|input.charAt(i)== 'M'|input.charAt(i)== 'N'|input.charAt(i)== 'O'|
//					input.charAt(i)== 'P'|input.charAt(i)== 'Q'|input.charAt(i)== 'R'|input.charAt(i)== 'S'|input.charAt(i)== 'T'|
//					input.charAt(i)== 'U'|input.charAt(i)== 'V'|input.charAt(i)== 'W'|input.charAt(i)== 'X'|input.charAt(i)== 'Y'|
//					input.charAt(i)== 'Z') {
//				spacedString.append(' ').append(input.charAt(i));
//			}
//			else {
//				spacedString.append(input.charAt(i));
//			}
//		}
//		System.out.println(spacedString);
//	    return spacedString.toString();
//	}
	
//	//-------------METHOD 2 - REGEX -----------
//	public static String camelCase(String input) {
//		StringBuilder spacedString = new StringBuilder();
//		System.out.println("String given: " + input);
//		if(input.length()==0) {
//			System.out.println("EMPTY!!!!");
//			System.out.println("Try again.");
//			return input;
//		}
//		System.out.println(input.replaceAll("([A-Z])", " $1"));
//		  return input.replaceAll("([A-Z])", " $1");
//	  }
	
//	//-------------METHOD 3 - TERNARY -----------
	public static String camelCase(String input) {
		System.out.println("String given: " + input);
		if(input.length()==0) {
			System.out.println("EMPTY!!!!");
			System.out.println("Try again.");
			return input;
		}
	    String output = "";
	    for (int i = 0; i < input.length(); i++) {
	    	output = Character.isUpperCase(input.charAt(i)) ? output + " " + input.charAt(i) : output + input.charAt(i);
	    }
	    System.out.println("With Spaces: " + output);
	    return output;
	}
	
//	//-------------MAIN METHOD -----------	
	public static void main(String[] args) {
		camelCase("hiBob");
		System.out.println("----------------------");
		camelCase("hi");
		System.out.println("----------------------");
		camelCase("hiBobRoberts");
		System.out.println("----------------------");
		camelCase("");
		System.out.println("----------------------");
		camelCase("heyAce");
	}
}
