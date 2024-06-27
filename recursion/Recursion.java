package recursion;

public class Recursion {
	public static int calculateSum(int[]arr, int index, int sum) {
		if(index == arr.length) {
			return sum;
		}
		sum += arr[index];
		
		sum = calculateSum(arr, ++index, sum);
//		THIS LINE IS HERE TO SHOW HOW RECURSION READS. EVERYTIME IT REAPPEARS, THE RECURSION IS READING THIS.
		System.out.println("i am here");
//		WE ARE NOT USING LOOPS. WE SET THE INDEX AS index, SO IN ORDER TO SEE IT, WE MUST CALL IT THIS WAY.
		System.out.println(index);
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(calculateSum(arr, 0, 0));
	}
}
