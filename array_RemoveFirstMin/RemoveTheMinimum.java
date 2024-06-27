package array_RemoveFirstMin;

import java.util.Arrays;

public class RemoveTheMinimum {
//	//-------------METHOD 1 -----------
	public static int[] removeSmallest(int[] numbers) {
		int min = numbers[0];
		// Create an array with a length of one less than our given to hold the values minus the min
		int[] minGone = new int[numbers.length-1];
		// Check if the array is empty
		if(numbers.length ==0) {
			// if it is, return null;
			System.out.println("EMPTY!");
			return null;
		}
		else if(numbers.length ==1) {
			System.out.println("You deleted the only exhibit number!");
			return null;
		}
		else {
			// Iterate through the array looking for the min
			for (int i = 1; i < numbers.length; i++) {
                // anytime you get a lower min, 
                if (numbers[i] < numbers[min]) {
                    // change the min to that number
                    min = i;
                }
            }
			// We have found our min.
			System.out.println("Found a min! "+ min);
		}
		// Now we have to iterate through again looking for the min
		int minIndex = 0;
		int minGoneIndex = 0;
         for (int i = 0; i < numbers.length; i++) {
             if (i != minIndex) {
                 minGone[minGoneIndex] = numbers[i];
                 minGoneIndex++;
             }
         }

         // Print the values in minGone
         System.out.println("Values in minGone: " + Arrays.toString(Arrays.copyOf(minGone, minGoneIndex)));
         return Arrays.copyOf(minGone, minGoneIndex);
	}
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
//		int numbers[] ={2,3,4,2};
		int numbers1[] ={};
//		int numbers2[] ={3};
//		removeSmallest(numbers);
		removeSmallest(numbers1);
//		removeSmallest(numbers2);
	}
}
