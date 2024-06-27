package string_vowelCount;

public class VowelCount {
//	//-------------METHOD 1 - IF-ELSE -----------
	public static int getCount(String str) {
		if(str.length() == 0) {
			System.out.println(str);
			System.out.println("EMPTY!!");
			return 0;
		}
		int vowelCount = 0;
		System.out.println("Given: " + str);
		String lowerString = str.toLowerCase();
		System.out.println("making lowercase: " + lowerString);
		for(int i=0; i<lowerString.length(); i++) {
			if(lowerString.charAt(i) == 'a'||lowerString.charAt(i) == 'e'||lowerString.charAt(i) == 'i'
					||lowerString.charAt(i) == 'o'||lowerString.charAt(i) == 'u') {
				vowelCount++;
			}
		}
		System.out.println("Vowel count is: " + vowelCount);
	    return vowelCount;
	}
	
//	//-------------METHOD 2 - TERNARY FUNCTION - DOESN'T WORK FOR CAPS
//	public static int getCount(String str) {
//	    int vowelsCount = 0;
//	    
//	    for(char c : str.toCharArray())
//	      vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
//	    System.out.println("String Name: " + str);
//	    System.out.println("Number of vowels :" + vowelsCount);
//	    return vowelsCount;
//	  }

//	//-------------METHOD 3 - STREAMS - DOESN'T WORK FOR CAPS
//	public static int getCount(String str) {
//        return str.replaceAll("(?i)[^aeiou]", "").length();
//    }

	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		String str = "wallaby";
		String str2 = "ATM";
		String str3 = "mmmm";
		String str4 = "oooooooooo";
		String str5 = "wallaby";
		String str6 = "";
		getCount(str);
		getCount(str2);
		getCount(str3);
		getCount(str4);
		getCount(str5);
		getCount(str6);
	}
}
