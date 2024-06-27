package array_String_WordsToSentence;

import java.util.stream.Collectors;			// FOR METHOD 3
import java.util.stream.Stream;				// FOR METHOD 3


					// GOAL
//TAKE THE ARRAY OF WORDS AND CONCATENATE WITH SPACING TO RETURN A SENTENCE STRING.
//THE SCENARIO IS JUST CREATING A SENTENCE WITH RANDOM ARRAY OF WORDS



public class ArrayWordsToSentence {
//	//-------------METHOD 1 - STRINGBUILDER METHOD -----------
//	public static String smash(String... words) {
//		StringBuilder sentence = new StringBuilder();
//		for(int i=0; i<words.length; i++) {
//			// Print the word
//			System.out.println(words[i]);
//			// Add the word to the sentence StringBuilder.
//			sentence.append(words[i]);
//			// Add the space between words.
//			sentence.append(" ");
//			// Print the sentence so far.
//			System.out.println(sentence);
//		}
//		// must return to actually turn toString and then just trim the trailing space off.
//		System.out.println("Your sentence is: " + sentence.toString().trim());
//		return sentence.toString().trim();
//	}
	
	
//	//-------------METHOD 2 - FOR EACH METHOD USING STRINGS -----------
//	public static String smash(String... words) {
//	    String s = "";
//	    // for each method
//	    for (String st: words){
//	    	// add the current word "st" and a space.
//	    	s += st + " ";
//	    }
//	    System.out.println(s.trim());
//	    // Trim off the trailing space and return the sentence.
//	    return s.trim();
//	  }
	
	
//	//-------------METHOD 3 - STREAMS -----------
	public static String smash(String... words) {
		System.out.println(Stream.of(words).collect(Collectors.joining(" ")));
		// USES BOTH COLLECTORS AND STREAMS
			// stream	//our array //join them together // separated by a space
		return Stream.of(words).collect(Collectors.joining(" "));
	}
	
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
		String[] words = {"hi","I'm","Joe"};
		smash(words);
	}
}
