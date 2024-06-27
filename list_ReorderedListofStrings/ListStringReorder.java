package list_ReorderedListofStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Finish for Homework
public class ListStringReorder {
	
	// Define a method named "groupAnagrams" that takes a List of Strings (anagrams) as a parameter and returns a List of Lists of Strings.
	public static List<List<String>> groupAnagrams(List<String> anagrams) {
		// Create a HashMap to store anagrams: key -sorted version of the characters in a word; value - list of anagrams with the same sorted characters.
        Map<String, List<String>> map = new HashMap<>();
        // Iterate through each String (str) in the input list (anagrams).
        for (String str : anagrams) {
        	// Convert the current string (str) to a char array
            char[] charArray = str.toCharArray();
            // Sort the array
            Arrays.sort(charArray);
            // create a new String "sortedString" from the sorted characters.
            String sortedString = new String(charArray);
            // Use computeIfAbsent to add the current string to the corresponding list in the map based on its sorted version. 
            // If the sorted version doesn't exist as a key in the map, create a new key with an empty list.
            map.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(str);
        }
//        System.out.println(new ArrayList<>(map.values()));
        return new ArrayList<>(map.values());
    }
	
	public static void main(String[] args) {
		List<String> givenList = new ArrayList<>();
        givenList.add("cat");
        givenList.add("odg");
        givenList.add("ate");
        givenList.add("tea");
        givenList.add("dog");
        givenList.add("tac");
        givenList.add("aet");

        List<List<String>> result = groupAnagrams(givenList);

        System.out.println(result);
		
	}
}


