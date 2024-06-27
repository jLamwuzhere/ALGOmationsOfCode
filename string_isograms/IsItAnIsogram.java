package string_isograms;

//import java.util.HashSet;		// FOR METHOD 4
//import java.util.Set;			// FOR METHOD 4

public class IsItAnIsogram {
//	//-------------METHOD 1 - FOR LOOPS -----------
	public static boolean  isIsogram(String str) {
		System.out.println("Given string: \"" + str +"\"");
//		Make all vowels same case because method ignores casing
		if(str.isEmpty()) {
			System.out.println("EMPTY! So technically true");
			return true;
		}
		if(str.length()==1) {
			System.out.println("length equals 1. True by default.");
			System.out.println(true);
			return true;
		}
		String lowered = str.toLowerCase();
		System.out.println("Lowered string: " + lowered);
		for(int i=0; i<lowered.length(); i++) {
			for(int j=i+1; j<lowered.length(); j++) {
//				Not sure why it's not appearing to check in order...
//				System.out.println("Current letter: " + lowered.charAt(i) + " matching with: " + lowered.charAt(j));
				if(i==j) {
					System.out.println(true);
					return true;
				}
				else if(lowered.charAt(i)==lowered.charAt(j)) {
					System.out.println("Uh-Oh! Found a match! " + lowered.charAt(i) + " = " + lowered.charAt(j) + "!");
					System.out.println(false);
					return false;
				}
			}
		}
		System.out.println(true);
		return true;
    } 
	
//	//-------------METHOD 2 - STREAMS -----------
//	  public static boolean  isIsogram(String str) {
//		  System.out.println(str.length() == str.toLowerCase()
//				  .chars()
//				  .distinct()
//				  .count());
//	    return str.length() == str.toLowerCase().chars().distinct().count();
//	  }
	
//	//-------------METHOD 3 - STREAMS BUT WITH PRINT STATEMENTS-----------
//	  public static boolean isIsogram(String str) {
//		    // Print the length of the string
//		    System.out.println("Length of the string: " + str.length());
//		    
//		    // Convert the string to lowercase and print it
//		    String lowered = str.toLowerCase();
//		    System.out.println("Lowercased string: " + lowered);
//		    
//		    // Print the count of distinct characters
//		    long distinctCount = lowered.chars().distinct().count();
//		    System.out.println("Count of distinct characters: " + distinctCount);
//		    
//		    // Print whether the length equals the count of distinct characters
//		    boolean isIsogram = str.length() == distinctCount;
//		    System.out.println("Is it an isogram? " + isIsogram);
//		    
//		    return isIsogram;
//		}
	
////	//-------------METHOD 4 - SET AND HASHSET - MESSY VERSION, STILL BROKEN-----------	  
//	  public static boolean isIsogram(String str) {
//		    Set<Character> letters = new HashSet<Character>();
//		    System.out.println(str);     
//		    for (int i = 0; i < str.length(); ++i) {
//		      if (letters.contains(str.toLowerCase().charAt(i))) {
//		    	  System.out.println(str + " is " + false);
//		        return false;        
//		      }
//		      System.out.println(letters.add(str.charAt(i)));
//		      letters.add(str.charAt(i));
//		    }
//		    System.out.println(str + " is " + true);
//		    return true;
//		  }
	
//	//-------------MAIN METHOD -----------	
	public static void main(String[] args) {
//		String str = "bot";
//		isIsogram(str);
		
		isIsogram("abc");
		System.out.println("-----------------------------------");
		isIsogram("HIi");
		System.out.println("-----------------------------------");
		isIsogram("devoured");
		System.out.println("-----------------------------------");
		isIsogram("");
		System.out.println("-----------------------------------");
		isIsogram("q");
		System.out.println("-----------------------------------");
		isIsogram("nopedout");
		System.out.println("-----------------------------------");
		isIsogram("bEe");
		System.out.println("-----------------------------------");
		isIsogram("isIsotope");
		System.out.println("-----------------------------------");
		isIsogram("abcdefghijklmnopi");
		System.out.println("-----------------------------------");
	}
}
