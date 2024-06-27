package array_InvertValues;

import java.util.Arrays; //FOR METHOD 2

public class InvertValues {
	
//	//-------------METHOD 1 - IF-ELSE *-1-----------
//	public static int[] invert(int[] array) {
//		if(array.length == 0) {
//			System.out.println("EMPTY!!");
//			return array;
//		}
//		else {
//			System.out.println("starting array: " + Arrays.toString(array));
//			for(int i=0; i<array.length; i++) {
//				array[i] *= -1;
//			}
//			System.out.println("inverted array: " + Arrays.toString(array));
//			return array;
//		}
//	}
	
//	//-------------METHOD 2 - STREAMS-----------
	public static int[] invert(int[] array) {
		System.out.println("starting array: " + Arrays.toString(array));
		int[] invertedArray =java.util.Arrays.stream(array).map(i -> -i).toArray();
		System.out.println("result: " + Arrays.toString(invertedArray));
		return invertedArray;
	}
	
	
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		int[] array = {0,1,-2,3};
		int[] array1 = {2, 3, 5};
		int[] array2 = {1};
		int[] array3 = {};
		invert(array);
		invert(array1);
		invert(array2);
		invert(array3);
	}
}
