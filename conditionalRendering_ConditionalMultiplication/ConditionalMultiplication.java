package conditionalRendering_ConditionalMultiplication;

public class ConditionalMultiplication {
	
//	-------------METHOD 1 - %2 (DIVIDE BY 2)-------------
    public static int simpleMultiplication(int n) {
        int total = 0;
        // MUST CHECK FOR BOTH 1 AND -1 BECAUSE DIVIDING A NEGATIVE BY 2 DOES NOT EQUAL 1 BUT RATHER -1!!
        if (n % 2 == 1 || n % 2 == -1) {
            total = n * 9;
            System.out.println(n + " * 9 = " + total);
        } else {
            total = n * 8;
            System.out.println(n + " * 8 = " + total);
        }

        return total;
    }
    
    
////	-------------METHOD 2 - MATH.ABSOLUTE - GETS RID OF NEED TO CHECK FOR NEGATIVES-------------
//    public static int simpleMultiplication(int n) {
//    	
//        int total = 0;
//        // SET THE TEST TO CHECK THE ABSOLUTE VALUE DIVIDED BY 2 TO DETERMINE EVEN OR ODD.
//        if (Math.abs(n) % 2 == 1) {
//            total = n * 9;
//            System.out.println(n + " * 9 = " + total);
//        } else {
//            total = n * 8;
//            System.out.println(n + " * 8 = " + total);
//        }
//
//        return total;
//    }


////    -------------METHOD 3 - TERNIARY - CLEANEST-------------
//    public static int simpleMultiplication (int n) {
//    	int total = (n % 2 == 0) ? n * 8 : n * 9;
//        System.out.println(n + " * " + ((n % 2 == 0) ? 8 : 9) + " = " + total);
//        return total;
//    }

    
    // --------------MAIN METHOD--------------
    public static void main(String[] args) {
        simpleMultiplication(12);
        simpleMultiplication(-7);
    }
}

