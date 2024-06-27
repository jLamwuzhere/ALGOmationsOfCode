package array_MaxSubArrayLengthEqualingZero;

public class MaxSubArrayLengthEqualingZero {
	
//		have 2 pointers, A and B.
//		move pointer B.
//		start adding to equal zero.
//		if it equals zero then store that array.
//		keep checking to see if it's longer.
//		if it is, replace the original with the new.
//		move the pointer
//		repeat and compare the new array length
//		continue to the end.
//		return the longest substring equaling zero
	public static int maxSubZeroLength(int[] arr){
		int maxCount = 0;
		int currCount = 0;
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
//			if(arr[i] == 0) {
//				currCount = 1;
//			}
			for(int j = (i+1); j < arr.length; j++) {
//			for(int j = 0; j < arr.length; j++) {
				sum+= arr[j];
				currCount++;
				System.out.println("i = " + i);
				System.out.println("j = " +j);
				if(sum == 0 && currCount > maxCount) {
					maxCount = currCount;
					System.out.println("count overtaken");
					System.out.println("maxCount = " + maxCount);
				}
//				else{
//					continue;
//				}
			}
			System.out.println("j loop finished");
		}
		return maxCount;
	}
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
//		suppose that it will equal zero somewhere
//		int[] arr = {15, -2, 2, 3, 15, -8, -7, 1, 3, 5};
		int[] arr = {-2, 2, 3, 15, -8, -7, 1, 3, 5};
		System.out.println(maxSubZeroLength(arr));
//		System.out.println(maxSubZeroLength(arr1));
	}

}
