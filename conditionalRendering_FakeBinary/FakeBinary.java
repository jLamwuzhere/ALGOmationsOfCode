package conditionalRendering_FakeBinary;

//import java.util.stream.Collectors;		//USED FOR METHOD 2

public class FakeBinary {
////-------------METHOD 1 - STRING BUILDER AND IF STATEMENTS-----------
////	- BEST FOR TOTAL INT STRINGS
////			- Changes non-numbers to 1 or 0 based on ASCII values.
//	public static String fakeBin(String numberString) {
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < numberString.length(); i++) {
//            char currentChar = numberString.charAt(i);
//            if (currentChar < '5') {
//                result.append('0');
//            } else {
//                result.append('1');
//            }
//        }
//
//        System.out.println(result);
//        return result.toString();
//    }
	
	
////-------------METHOD 2 - STREAMS------------
//// 	- Works for leaving letters alone, using line 36.
//	public static String fakeBin(String numberString) {
////							Convert the string to an IntStream of ASCII values
//        String result = numberString.chars()
//        		// Lets you see the current character in the String as it iterates through.
//        		.peek(c -> System.out.println("Current char: " + (char) c))
//				// Convert each ASCII value back to a character
//                .mapToObj(c -> (char) c)
//                // Performs the check to make it a 1 or 0. Leaves not int-like chars alone.
//                .map(c -> Character.isDigit(c) ? (c < '5' ? '0' : '1') : c)
////                For instead also changing letters and not int-like strings based on ASCII values 
////                .map(c -> c.compareTo("5") < 0 ? "0" : "1")
//                // Converts each value to the String version of the int
//                .map(String::valueOf)
//                // Joins the Strings together at the end
//                .collect(Collectors.joining());
//		System.out.println(result);
//		return result;
//    }

	
////-------------METHOD 3 - CLEAN REPLACE------------
	public static String fakeBin(String numberString) {
		System.out.println(numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1"));
//									Brackets are your range
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
	

	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
		System.out.println("String CURRENT CONVERTS TO: ");
		fakeBin("093234499");
		fakeBin("093234499A");
	}
}
