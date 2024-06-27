package array_SumArrayWithStringsAndIntegers;
import java.util.List;

public class SumMixedArray {
	
////	-------------METHOD 1 - SWITCH STATEMENT -(ONLY WORKS FOR 0-9 POSITIVE!!)-------------
//	public int sum(List<?> mixed) {
//        int sum = 0;
//
//        for (Object obj : mixed) {
//            if (obj instanceof Integer) {
//                sum += (int) obj;
//            } else if (obj instanceof String) {
//                String str = (String) obj;
//                switch (str) {
//                    case "1":
//                        sum += 1;
//                        break;
//                    case "2":
//                        sum += 2;
//                        break;
//                    case "3":
//                        sum += 3;
//                        break;
//                    case "4":
//                        sum += 4;
//                        break;
//                    case "5":
//                        sum += 5;
//                        break;
//                    case "6":
//                        sum += 6;
//                        break;
//                    case "7":
//                        sum += 7;
//                        break;
//                    case "8":
//                        sum += 8;
//                        break;
//                    case "9":
//                        sum += 9;
//                        break;
//                    case "0":
//                        sum += 0;
//                        break;
//                    default:
//                        // Handle other cases if needed
//                        break;
//                }
//            }
//        }
//        System.out.println("The sum TOTAL is: " + sum);
//        return sum;
//    }
	
	//	-------------METHOD 2 - ITERATE THROUGH A LIST AND PARSE INTS -- BETTER OPTION-------------
	
					//	Step 1: Iterate through list
					//		- for each index, convert to int value
					//	Step 2 - add to sum variable
					//	Step 3: return sum.
	
//    public int sum(List<?> mixed) {
//    	// SET A VARIABLE TO HOLD THE SUM AND SET IT EQUAL TO ZERO
//        int sum = 0;
////        ITERATE THROUGH EACH ELEMENT IN THE MIXED LIST OBJECT
//        for (Object element : mixed) {
////        	CHECK IF THE CURRENT ELEMENT IS AN INTEGER
//            if (element instanceof Integer) {
////            	IF SO, JUST ADD IT TO THE SUM
//                sum += (int) element;
////            IF THE CURRENT ELEMENT IS NOT AN INTEGER:
//            } else if (element instanceof String) {
//                try {
////                	TRY TO PARSE THE STRING INTO AN INTEGER
//                    int intValue = Integer.parseInt((String) element);
////                  THEN ADD THE INTEGER TO THE SUM
//                    sum += intValue;
////                IF THE CURRENT ELEMENT CANNOT BE PARSED INTO AN INTEGER:
//                } catch (NumberFormatException e) {
//                    // Handle the case where the string cannot be parsed as an integer
//                    System.out.println("Error converting string to integer");
//                }
//            }
//        }
////        PRINT THE SUM IN THE CONSOLE TO KEEP TRACK
//        System.out.println("The sum TOTAL is: " + sum);
////      FINALLY, RETURN THE SUM
//        return sum;
//    }
	

	//	-------------METHOD 3 - ITERATE THROUGH A LIST AND PARSE INTS USING STREAMS -- BEST OPTION-------------
//		Takes a List of any type called "mixed"; due to taking both Strings and Integers.
	public int sum(List<?> mixed) {
//		PRINT STATEMENT. SEE BELOW.
		System.out.println("The sum TOTAL is: " + mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum());
//		mapToInt(o -> Integer.parseInt(o.toString())) is used to transform each element of the stream into an integer.
//		-The variable o is a parameter for the lambda expression used in the mapToInt operation. The o is just a 
//			placeholder name for each element in the stream. You could use any valid identifier in place of o and
//			the code would function the same way.
//		-It applies a mapping function that converts each element to a string using o.toString()
//		-and then parses that string into an integer using Integer.parseInt().
//		.sum() adds up all the ints at the end.
		return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
	}
	
    
	// 		--------------MAIN METHOD--------------
    public static void main(String[] args) {
        SumMixedArray sumMixedArray = new SumMixedArray();
        List<Object> mixedList1 = List.of(1, 2, 4, -5, "3", "7", "0");
        List<Object> mixedList2 = List.of(1, 2, 4, -5, "3", "7", "0", "10");  // DOESN'T WORK FOR METHOD 1
        List<Object> mixedList3 = List.of(1, 2, 4, -5, "3", "7", "0", "10", "-130");  // DOESN'T WORK FOR METHOD 1
//        List<Object> mixedList = List.of(1, 2, 4, "-5", "3", "7", "0");

        sumMixedArray.sum(mixedList1);
        sumMixedArray.sum(mixedList2);
        sumMixedArray.sum(mixedList3);
    }
}
