package string_ReversedString;

public class ReverseAgain {
	public static String reverseThisString(String str) {
		StringBuilder reversed = new StringBuilder();
		for(int i= str.length()-1; i>=0; i--) {
			reversed.append(str.charAt(i));
		}
		System.out.println(reversed.toString());
		return reversed.toString();
	}
	
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
		reverseThisString("Abdi");
	}

}
