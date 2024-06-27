package string_HighestScoringWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;			//FOR METHOD 2

public class HighestScoringWord {
////	//-------------METHOD 1 -----------
//	public static String high(String s) {
////		Declare our starting sentence
//		System.out.println("Your sentence is: " + s);
////		TO STORE THE SCORE
//		int score = 0;
//		int highScore = 0;
//		if(s.isBlank()|s.isEmpty()) {
//			System.out.println("EMPTY!!");
////			highScore=0;
//			return"";
//		}
////		TO STORE THE CURRENT HIGHEST WORD
//		StringBuilder highWord = new StringBuilder();
//		// USED FOR STORING LETTERS AND LATER GETTING THEIR VALUES -- DONE BY ADDING ONE TO THEIR INDEX POSITION.
//		char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U','V', 'W', 'X', 'Y', 'Z'};
////        I DON'T THINK IM GOING TO MAP THE VALUES FOR THIS ONE, SO LIKELY NOT NEEDED.
////        int[] points = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
////		CREATE A WORD ARRAY
//		ArrayList<String> words = new ArrayList<>(Arrays.asList(s.split("\\s+")));
////		Show the word array
//		System.out.println("Word array: " + words.toString());
////		Character array
//		for(String word : words) {
//////			Display the current word
////			System.out.println("Current word: " + word);
//			char[] chars = word.toUpperCase().toCharArray();
////	    	TO GET A SINGLE WORD'S SCORE
//	        for(int i = 0; i<chars.length; i++) {
//	        	for(int j=0; j<letters.length; j++) {
//	        		if(chars[i]==letters[j]) {
//	        			score +=j+1;
////	//        			Running total:
////	        			System.out.println(" + " + (j+1) + " = " + score);
//	        		}
//	        	}
//	        }
////	        DO A CHECK TO SEE IF THE CURRENT WORD'S SCORE IS BETTER THAN THE STORED SCORE
//			if(score>highScore) {
////				SET THE CURRENT WORD SCORE AS THE HIGH SCORE
//			 	highScore = score;
//			 	System.out.println("New high scoring word! " + word + ": " + highScore);
////			 	CLEAR THE PREVIOUS highWord
//				highWord.setLength(0);
////				SET THE CURRENT WORD AS THE NEW highWord
//			 	highWord.append(word); 
//			}
////      	Print current word score
//	        System.out.println("Current word score: '" + word + "': " + score + " points");
//	        score=0;
//		}
//////		FOR A HIGHSCORE POINT RETURN
////		String highScoreString = highScore + "";
////		System.out.println("your score this round: " + highScoreString + " points");
////	    return highScoreString;
//		System.out.println("Your word: " + highWord);
//		return highWord.toString();
//	 }
	
	//-------------METHOD 2 STREAMS ----------
	public static String high(String s) {
	    // Declare our starting sentence
	    System.out.println("Your sentence is: " + s);
	    
	    String highestScoringWord = Arrays.stream(s.toLowerCase()
	    		.split(" "))
	            .max(Comparator.comparingInt(word -> word.chars().map(c -> c - 'a' + 1).sum()))
	            .orElse("");

	    System.out.println("Highest scoring word: " + highestScoringWord);
	    return highestScoringWord;
	}
	
	
//	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		high("a");
		System.out.println("-----------------------------------------");
		high("abc");
		System.out.println("-----------------------------------------");
		high("abad");
		System.out.println("-----------------------------------------");
		high("zsdweafgg");
		System.out.println("-----------------------------------------");
		high("hi Im John");
		System.out.println("-----------------------------------------");
		high("John Im Jo");
		System.out.println("-----------------------------------------");
		high("");
	}
}
