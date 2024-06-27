package string_Palindrome;

public class IsAPalindrome {
	
//	//-------------METHOD 1 - IF-ELSE -----------
	public static boolean isPalindrome(int n) {
		System.out.println("Given: " + n);
		
		StringBuffer number = new StringBuffer();
		number.append(n);
		System.out.println("number: " + number);
		
		StringBuffer reversed = new StringBuffer();
		reversed.append(n).reverse();
		System.out.println("reversed: " + reversed);
		
		if(number.toString().equals(reversed.toString())) {
			System.out.println(true);
			return true;
		}
		System.out.println(false);
		return false;
	}
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		isPalindrome(12321);
		isPalindrome(123);
	}

}
