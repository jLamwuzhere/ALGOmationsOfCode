package string_StringBuilder_CountingSheep;

// Accepts positive integer

public class CountingSheep {
    public static String countingSheep(int num) {
//    	Start with an empty result string
        String result = "";
//		Run through each number from 1 to our target integer
        for (int i = 1; i <= num; i++) {
//        	At each implementation append the result to the end
            result += i + " sheep... ";
        }
//      return the final result
        return result;
    }
//			ALT 2 - STRING BUILDER METHOD
    //public static String countingSheep(int num) {
//		// Create a StringBuilder
    //    StringBuilder result = new StringBuilder();
    //  //Run through each number from 1 to our target integer
    //    for (int i = 1; i <= num; i++) {
//			//For each number append to the stringbuilder string
    //        result.append(i).append(" sheep... ");
    //    }
    //		return the result, but set as toString method to get result rather than memory location.
    //    return result.toString();
    //}
//}
    
//    		ALT 3 - STREAMS METHOD
//    import java.util.stream.Collectors;
//    import java.util.stream.IntStream;
//
//    public class Kata {
//      public static String countingSheep(int num) {
//        return IntStream.rangeClosed(1, num)
//                        .mapToObj(i -> i + " sheep...")
//                        .collect(Collectors.joining());
//      }
//    }
    
    
//    MAIN METHOD
    public static void main(String[] args) {
		System.out.println(countingSheep(12));
		System.out.println(countingSheep(1));
  }
}

