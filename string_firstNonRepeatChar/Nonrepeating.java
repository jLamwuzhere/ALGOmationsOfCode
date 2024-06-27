package string_firstNonRepeatChar;

import java.util.HashMap;				//FOR METHOD 1
//import java.util.LinkedHashMap;			//FOR METHOD 2
import java.util.Map;					//FOR METHODS 1 AND 2

public class Nonrepeating {
//	//-------------METHOD 1 -----------
	public static char firstNonRepeatingChar(String str) {
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
            if (charCount.get(c) == 1) {
            	System.out.println(c);
                return c;
            }
        }
        // If no non-repeating character is found, return a default character, such as '\0'
        System.out.println("No non-repeating character found.");
        return '\0'; // Or you can return any other default character as needed
    }
	
	
//	//-------------METHOD 2 -----------
//	public static char firstNonRepeatingChar(String str) {
//        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
//        
//        // Count occurrences of each character in the string
//        str.chars().forEach(c -> charCountMap.put((char) c, charCountMap.getOrDefault((char) c, 0) + 1));
//        
//        // Find the first character with count 1
//        System.out.println("First non-repeating is: " + str.chars()
//                .mapToObj(c -> (char) c)
//                .filter(c -> charCountMap.get(c) == 1)
//                .findFirst()
//                .orElseThrow(() -> new RuntimeException("No non-repeating character found")));
//        return str.chars()
//                .mapToObj(c -> (char) c)
//                .filter(c -> charCountMap.get(c) == 1)
//                .findFirst()
//                .orElseThrow(() -> new RuntimeException("No non-repeating character found"));
//    }
	
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		firstNonRepeatingChar("jeff");
		firstNonRepeatingChar("ttto");
		firstNonRepeatingChar("---");
		firstNonRepeatingChar("");
	}
}
