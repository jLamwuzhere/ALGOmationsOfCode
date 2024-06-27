package int_Array_ConvertNumToReversedDigitArray;

import java.util.Arrays;


											// GOAL
//GIVEN A NUMBER OF MULTIPLE DIGITS, RETURN THAT BACKWARDS WITH EACH DIGIT IN AN ARRAY
//THE SCENARIO IS AS ABOVE 123 WOULD RETURN [3, 2, 1].


public class NumberToReversedDigitArray {
////	-------------METHOD 1-STRING BUILDER TO REVERSED ARRAY ------------
//    public static int[] digitize(long n) {
//        // Convert the long to a string, reverse the characters
////    	Converts n to a string, reverses the characters using StringBuilder, and 
////    	converts it back to a string (toString()) called "reversed".
//        String reversed = new StringBuilder(String.valueOf(n)).reverse().toString();
////      Creates an array "result" to store the reversed digits of size equal to the reversed string length.
//        System.out.println("flipping... " + reversed);
//        
//        int[] result = new int[reversed.length()];
////        USE A FOR LOOP TO GO THROUGH THE STRING AND OUTPUT EACH NUMBER.
//        for (int i = 0; i < reversed.length(); i++) {
////        	Prints and assigns the numeric value of the reversed character at index i to 
////        	the corresponding position in the result array.
////        	This line prints the reversed digits one by one as they are added to the array.
//        	System.out.println(result[i] = Character.getNumericValue(reversed.charAt(i)));
////        	Assigns each character at index i to the corresponding position in the result array.
//            result[i] = Character.getNumericValue(reversed.charAt(i));
//        }
////        COLLECT ALL THESE NUMBERS INTO AN ARRAY
////        Prints the final reversed array using Arrays.toString(result).
//        System.out.println("Reversed array: " + Arrays.toString(result));
//        return result;
//    }
	
//	-------------METHOD 2 - CLEAN VERSION------------
	public static int[] digitize(long n) {
//						creates StringBuilder     adds 12345 to the StringBuilder string
	    int[] reversedArray = new StringBuilder().append(n)
//	    										   flips the StringBuilder string to 54321
	                                              .reverse()
//	                                              changes each value to the ASCII value of the number.
	                                              .chars()
//	                                              maps each ASCII individually to its numeric value in an IntStream
	                                              .map(Character::getNumericValue)
//	                                              converts this IntStream of values into an array.
	                                              .toArray();
	    // Print the reversed array before returning
	    System.out.println("Reversed array: " + Arrays.toString(reversedArray));
	    return reversedArray;
	}

	
    // --------------MAIN METHOD--------------
    public static void main(String[] args) {
        digitize(1087653);
        digitize(11);
        digitize(39000093);
        digitize(000);
    }
}
