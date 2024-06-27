package string_WordCount;

public class CountTheWordsInString {
	public static int countWords(String sentence) {
		System.out.println("Given: " + sentence);
		int count = 1;
		// CREATE A NEW STRING WITH TRIMMED LEADING AND TRAILING SPACES.
		String s = sentence.trim();
		// RUN A FOR LOOP
		for(int i=0; i<s.length()-1; i++) {
			// CHECK IF THERE'S A SPACE AND THE NEXT CHAR ISN'T ALSO A SPACE.
			if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("Word count: " + count);
		return count;
	}
	
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
//		countWords("Hi John");
//		countWords("Hi John Doe");
//		countWords(" Hi  John  Doe ");
		countWords("by a factor of five  at least");
	}

}
