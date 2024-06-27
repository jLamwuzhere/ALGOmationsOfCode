package string_Palindrome;

public class PalindromeCheck {
	// METHOD TO REVERSE THE STRING
	public static String reverseMyString(String str) {
		StringBuilder reversed = new StringBuilder();
		for(int i= str.length()-1; i>=0; i--) {
			reversed.append(str.charAt(i));
		}
		System.out.println(reversed.toString());
		return reversed.toString();
	}
	// METHOD TO CHECK IF REVERSED STRING MATCHES GIVEN STRING
	public static boolean isItPalindrome(String str) {
		String test = reverseMyString(str);
		if(test.equals(str)){
			System.out.println(true);
			return true;
		}
		else {
			System.out.println(false);
			return false;
		}
	}
	
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
		isItPalindrome("Abdi");
		isItPalindrome("aba");
	}
}
