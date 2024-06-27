package array_SumPositiveAndNegativeNumbers;

import java.util.Arrays;


										//TARGET GOAL:
//Given an array, sum up all the positives and negatives and store them each in a variable. Then put that variable in a new array.
//EXAMPLE [1,2,3,-1] will return 6 and -1 as [6, -1].


public class SumsOfPositiveAndNegativeNumbers{
	public static int[] countPositivesSumNegatives(int[] input) {
//		set a variable to keep count of positive numbers
        int positive = 0;
//		set a variable to keep sum of negative numbers
        int negative = 0;
        
//      Check if the length is null or less than 1.
    	if (input == null || input.length < 1) {
    			System.out.println("empty");
			      return new int[] {};
        } else {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    positive++;
                    System.out.print(positive);
                } else {
                    negative += input[i];
                    System.out.print(negative);
                }
            }
//            System.out.println(new int[]{positive, negative});
            return new int[]{positive, negative};
        }
    }
	public static void main(String[] args) {
        // Givens:
        // eloquent
//    	This line is if we didn't print in our method
//      System.out.println(remove("eloquent"));
//    	Since we did print in our method, we can simply call the method.
		int[] result = countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15});
		System.out.println(" ");
	    System.out.println(Arrays.toString(result));
	    int[] result2 = countPositivesSumNegatives(new int[]{});
	    System.out.println(Arrays.toString(result2));
    }
}

