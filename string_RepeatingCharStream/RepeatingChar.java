package string_RepeatingCharStream;

//LEETCODE PROBLEM:
//USE STREAMS TO SOLVE!!!
//1) take this string and return the first repeating character in it.
//1) take this string and return the first non-repeating character in it.

import java.util.HashMap;
import java.util.Map;

public class RepeatingChar {
//	//-------------METHOD 1 -----------
	public static char firstRepeatingChar(String str) {
		if(str.length()==0) {
			System.out.println("Length is 0! Nothing to find.");
			return '\0'; 
		}
//		declaring and initializing a HashMap called charCount, maps characters(Character) to their counts(Integer)
        Map<Character, Integer> charCount = new HashMap<>();
        // Count occurrences of each character in the string
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        // Find the first character with count 1
        for (char c : str.toCharArray()) {
            if (charCount.get(c) > 1) {
            	System.out.println(c);
                return c;
            }
        }
        // If no non-repeating character is found, return a default character, such as '\0'
        System.out.println("No repeating character found.");
        return '\0'; // Or you can return any other default character as needed
    }
	
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		firstRepeatingChar("jeff");
		firstRepeatingChar("jef");
		firstRepeatingChar("ttto");
		firstRepeatingChar("---");
		firstRepeatingChar("");
	}

}
