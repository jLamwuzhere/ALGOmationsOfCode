package string_LongestNonRepeating;
import java.util.HashMap;

public class LongestNonRepeatingCharInString {
    
    public static int longestSubstring(String s) {
        System.out.println("Given: " + s);
        
        // CHECK IF NULL OR LENGTH IS ZERO
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxLength = 0;
        int left = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (charMap.containsKey(currentChar)) {
                left = Math.max(charMap.get(currentChar) + 1, left);
            }
            charMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println("Max length: " + maxLength);
        return maxLength;
    }
    
    // --------------MAIN METHOD--------------
    public static void main(String[] args) {
        longestSubstring("aaaaaaaaaa"); // Output should be 1
        System.out.println("----------");
        longestSubstring("abc"); // Output should be 3
        System.out.println("----------");
        longestSubstring("abaaab"); // Output should be 2
        System.out.println("----------");
        longestSubstring("ccacdcaa"); // Output should be 2
    }
}