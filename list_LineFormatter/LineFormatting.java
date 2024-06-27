//Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
//Write a function which takes a list of strings and returns each line prepended by the correct number.
//The numbering starts at 1. The format is n: string. Notice the colon and space in between.
//Examples: (Input --> Output)
//[] --> []
//["a", "b", "c"] --> ["1: a", "2: b", "3: c"]


package list_LineFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineFormatting {
	//-------------METHOD 1 -----------
	public static List<String> number(List<String> lines) {
		System.out.println("Given: " + lines);
		List<String> numberedList = new ArrayList<>();
		if (lines == null) {
	        System.out.println("Input list is null!");
	        return null;
	    }
		if(lines.size()==0| lines.isEmpty()) {
			System.out.println("EMPTY!!!");
			return numberedList;
		}
//		for( String line : lines) {
		for(int i=0; i<lines.size(); i++) {
			numberedList.add((i+1) + ": " +lines.get(i));
		}
		System.out.println("HERE");
		System.out.println(numberedList);
		return numberedList;
//		return numberedList;
    }
	
	
//	//-------------METHOD 2 - STILL NEEDS NULL AND EMPTY CHECKS-----------
//	static List<String> number(List<String> lines) {
//		System.out.println("Given: " + lines);
//        for(int i= 0; i< lines.size() ; i++)
//        {
//          lines.set(i,(i+1)+": "+lines.get(i));
//        }
//        System.out.println(lines);
//        return lines;
//    }
	
	
//	//-------------MAIN METHOD-----------
	public static void main(String[] args) {
		number(Arrays.asList("a", "b", "c"));
		//FOR AN EMPTY LIST CHECK
		number(Arrays.asList());
		//FOR A NULL CHECK
		List<String> nullList = null;
		number(nullList);
	}
}
