package string_LongestCommonSubstring;

// Return the longest Common prefix(beginning substring).
//given {"Hello", "He", "Hell"
//	should return "He"

public class LongestCommonPrefix {
	public static String findLongestCommonPrefix(String[] given) {
        if (given == null || given.length == 0) {
            return "";
        }
        // Assume the first string is the initial common prefix
        String result = given[0];
        
        for (int i = 1; i < given.length; i++) {
            int j = 0;
            // Iterate through characters of the current string and the current common prefix
            while (j < result.length() && j < given[i].length() && result.charAt(j) == given[i].charAt(j)) {
                j++;
            }
            // Update the common prefix based on the current string
            result = result.substring(0, j);
            
            // If the common prefix becomes empty, break the loop
            if (result.isEmpty()) {
                break;
            }
        }
        System.out.println();
        return result;
    }

	// --------------MAIN METHOD--------------	
	public static void main(String[] args) {
		String[] given = {"Hello", "He", "Hell"};
        findLongestCommonPrefix(given);	
	}
}
