package array_SumInts;

					//TARGET GOAL:
//Given an array, arr, return the total sum of the array.
// EXAMPLE [1,2,3] will return 6, because 1 + 2 + 3 = 6.


public class SumArrayInts {
	static int calculateSum(int arr[]) {
//		set a variable for sum
		int sum = 0;
//		loop through the array
		for(int i=0; i<arr.length; i++) {
//			add each element to the previous total
			sum  += arr[i];
		}
//		return the total sum
		System.out.println("This array totals: " + sum);
		return sum;
	}
	
	
//	MAIN METHOD FOR WHICH TO INITIATE:
	public static void main(String[] args) {
//		declare an array and array type
		int arr[]= {1,2,3};
//		print statement for sum calling method above
		calculateSum(arr);
		
	}
}
