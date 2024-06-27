package array_PlusOne;

import java.util.ArrayList;
import java.util.Arrays;

//			NEATCODE #66
//  Given an array, increase the last number in the array 
//  BONUS: return the array as a number

public class PlusOne {
//	//-------------METHOD TO BUILD NEW NUMBER ARRAY -----------
	public static int[] plusOne(int[] nums) {
		System.out.println("Given: " + Arrays.toString(nums));
		int[] numbers = new int[nums.length];
//		System.out.println("length: " + nums.length);
		for(int i=0; i<nums.length-1; i++) {
			numbers[i]=nums[i];
		}
		numbers[nums.length-1]=nums[(nums.length-1)]+1;
		System.out.println("numbers[" + (nums.length-1) + "]: " + (nums[(nums.length-1)]+1));
		System.out.println("new array: " + Arrays.toString(numbers));
		return numbers;
	}
//	//-------------METHOD TO BUILD NEW NUMBER ARRAY HANDLING INCREASING 9-----------
	public static int[] plusOneWith9s(int[] nums) {
		System.out.println("Given: " + Arrays.toString(nums));
		ArrayList<Integer> numbersArr = new ArrayList<Integer>();
//		System.out.println("length: " + nums.length);
		for(int i=0; i<nums.length; i++) {
			numbersArr.add(nums[i]);
			System.out.println("NUMBERSARRAY: " + numbersArr);
		}
		// IF THE NUMBER AT THE END IS LESS THAN 10
		if(numbersArr.indexOf(numbersArr.size()-1)<10) {
//		if(numbers[nums.length-1]<10) {
//			numbersArr.indexOf(numbersArr.size())=(numbersArr.indexOf(numbersArr.size())+1);
//			numbersArr.add(nums[(nums.length-1)]+1);
			numbersArr.indexOf(numbersArr.size()-1);
		}
		// IF THE NUMBER AT THE END IS 10:
		else {
//			int pointer = numbers.length-1;
//			int pointer2 = pointer -1;
//			int pointer3 = pointer2-1;
			// IF THE LENGTH IS 1
			if(numbersArr.indexOf(numbersArr.size()-1)==10&& nums.length==1) {
				System.out.println("here");
				numbersArr.add(-1, 1);;
			}
			// IF THE LENGTH IS 2
			if(numbersArr.indexOf(numbersArr.size()-1)==10&& nums.length==2) {
				System.out.println("here2");
			}
			else {
				System.out.println("here3");
			}
		}
//		TURN ARRAYLIST INTO AN ARRAY USING STREAMS
		int[] numbers = numbersArr.stream().mapToInt(i -> i).toArray();
		System.out.println("NUMBERS: " + Arrays.toString(numbers));
		return numbers;
	}
	
//	//-------------METHOD TO CONVERT NUMBER ARRAY TO INTEGER -----------
	public static int plusOneAsInteger(int[] numbers) {
		StringBuilder stringInteger = new StringBuilder();
        for (int number : numbers) {
        	stringInteger.append(number);
        }
		
		System.out.println("converting to String: \"" + stringInteger + "\"");
		int numberInteger = Integer.parseInt(stringInteger.toString());
		System.out.println("number: " + numberInteger);
		return numberInteger;
//		return stringInteger;
	}
	
	// --------------MAIN METHOD--------------	
	public static void main(String[] args) {
//		plusOne(new int[] {1,2,3});
		plusOneAsInteger(plusOne(new int[] {1,2,3}));
//		plusOneWith9s(new int[] {2,9,9});
//		plusOneWith9s(new int[] {9,9});
//		plusOneWith9s(new int[] {9,0,9});
//		plusOneWith9s(new int[] {9});
//		plusOneAsInteger(plusOneWith9s(new int[] {9}));
		
	}
}
