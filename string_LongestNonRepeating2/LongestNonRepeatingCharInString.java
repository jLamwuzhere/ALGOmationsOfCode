package string_LongestNonRepeating2;


public class LongestNonRepeatingCharInString {
//	//-------------METHOD 1 - NESTED FOR LOOPS -----------
	public static int longestSubstring(String s) {
		System.out.println("Given: " + s);
		int first = 0;
		int count = 1;
		int maxCount = 1;
		for (int i = 1; i < s.length(); i++) {
            boolean foundRepeat = false;
            for (int j = first; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    first = j + 1;
                    foundRepeat = true;
                    break;
                }
            }
            if (foundRepeat) {
                count = i - first + 1;
            }
            else {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println("Longest non-repeat substring: " + maxCount);
        return maxCount;
    }
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
		longestSubstring("aaaaaaaaaa");
		System.out.println("----------");
		longestSubstring("abc");
		System.out.println("----------");
		longestSubstring("abaaab");
		System.out.println("----------");
		longestSubstring("ccaaa");
		System.out.println("----------");
		longestSubstring("abcabcbb");
		System.out.println("----------");
		longestSubstring("pwwkew");
	}
}
