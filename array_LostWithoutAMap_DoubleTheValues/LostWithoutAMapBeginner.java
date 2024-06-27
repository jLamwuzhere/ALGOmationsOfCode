package array_LostWithoutAMap_DoubleTheValues;

import java.util.Arrays;
//import java.util.stream.IntStream; // FOR METHOD 3

public class LostWithoutAMapBeginner {
	
//	//-------------METHOD 1 - FOR LOOP -----------
	public static int[] map(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i]*2;
		}
		System.out.println("My doubled array is: " + Arrays.toString(arr));
		return arr;
	}
	
	//-------------METHOD 2 - STREAMS -----------
//	public static int[] map(int[] arr) {
//	    int[] doubledArray = Arrays.stream(arr).map(x -> x * 2).toArray();
//	    System.out.println(Arrays.toString(doubledArray));
//	    return doubledArray;
//	}
	
	//-------------METHOD 3 - INT STREAMS -----------
//	public static int[] map(int[] arr) {
//		// We are passing it into a doubled array value so that we can show it. Otherwise we could just return this method instead.
//		int[] doubledArray = IntStream.of(arr).map(i -> i*2).toArray();
//		System.out.println(Arrays.toString(doubledArray));
//		return doubledArray;
//	}
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		int[] arr = {-2, 2, 3, 15, -8, -7, 1, 3, 5};
		int[] arr1 = {2, 3, 5};
		map(arr);
		map(arr1);
	}
}
