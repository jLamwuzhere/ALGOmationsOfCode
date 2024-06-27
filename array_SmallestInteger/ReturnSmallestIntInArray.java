package array_SmallestInteger;
import java.util.Arrays;			// FOR ARRAYS.SORT METHOD
//import java.util.stream.IntStream;  // FOR INT STREAMS

public class ReturnSmallestIntInArray {
	
////					METHOD 1 - LOOPING THROUGH
//	public static int findSmallestInt(int[] args) {
//	    int smallestInt = args[0];
//	    for (int i = 0; i < args.length; i++) {
//	        if (args[i] < smallestInt) {
//	            smallestInt = args[i];
//	        }
//	    }
//	    System.out.println("The smallest integer in the array is: " + smallestInt);
//	    return smallestInt;
//	}
	
//				METHOD 2 - ARRAYS.SORT METHOD
    public static int findSmallestInt(int[] args) {
      Arrays.sort(args);
      System.out.println("The smallest integer in the array is: " + args[0]);
      return args[0];
    }
    
//////					METHOD 3 - INT STREAMS
//    public static int findSmallestInt(int[] args) {
//    	System.out.println("The smallest integer in the array is: " + IntStream.of(args).min().getAsInt());
//        return IntStream.of(args).min().getAsInt();
//    }
    
//   	--------------MAIN METHOD--------------
    public static void main(String[] args) {
        findSmallestInt(new int[]{1, 2, 4, -5});
    }
}

