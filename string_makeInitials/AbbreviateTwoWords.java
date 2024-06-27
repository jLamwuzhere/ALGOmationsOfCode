package string_makeInitials;

import java.util.ArrayList;		//FOR METHOD 1
import java.util.Arrays;

public class AbbreviateTwoWords {
//	//-------------METHOD 1 - ONLY ONE TO ACCOUNT FOR LEADING AND TRAILING SPACING-----------
	public static String abbrevName(String name) {
		System.out.println("Your name: " + name);
		String rawName=name.strip();
		System.out.println("Removing leading and trailing spaces: " + rawName);
		String[] nameArray = rawName.split(" ");
		System.out.println("Creating name array: " + Arrays.toString(nameArray));
		ArrayList<String> initialArray = new ArrayList<>();
		for (String word : nameArray) {
            initialArray.add(String.valueOf(word.charAt(0)));
        }
		System.out.println("Isolating initials... " + initialArray.toString());
		StringBuilder initials = new StringBuilder();
		for(int i=0; i<initialArray.size(); i++) {
			if(i<initialArray.size()-1) {
				initials.append(initialArray.get(i).toUpperCase() + ".");
			}
			else {
				initials.append(initialArray.get(i).toUpperCase());
			}
		}
		System.out.println("The initials for this name are: " + initials);
	    return initials.toString();
    }
	
////	-------------METHOD 2 -----------
//	public static String abbrevName(String name) {
//	    String[] names = name.split(" ");
//	    System.out.println("Creating name array: " + Arrays.toString(names));
//	    System.out.println("The initials for this name are: " + (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase());
//	    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
//	  }
	
//	//-------------METHOD 3 - REGEX -----------
//	public static String abbrevName(String name) {
//		System.out.println("The initials for this name are: " + name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2"));
//	    return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
//	  }
	
	
//	//-------------METHOD 4 -----------
//	public static String abbrevName(String name) {
//        String[] init = name.split(" ");
//        System.out.println("Creating name array: " + Arrays.toString(init));
//        System.out.println("The initials for this name are: " + init[0].substring(0, 1).toUpperCase().concat("."+ init[1].substring(0, 1).toUpperCase()));
//        return init[0].substring(0, 1).toUpperCase().concat("."+ init[1].substring(0, 1).toUpperCase());
//    }
	
	//MAIN METHOD
	  public static void main(String[] args) {
		abbrevName("John Doe");
//		abbrevName("    John Doe   ");
		abbrevName("jim bone");
	  }

}
