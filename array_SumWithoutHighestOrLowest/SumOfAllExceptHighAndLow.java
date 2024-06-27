package array_SumWithoutHighestOrLowest;

import java.util.Arrays;

public class SumOfAllExceptHighAndLow {
	public static int sum(int[] numbers){
		System.out.println("Given: " + Arrays.toString(numbers));
		int sum = 0;
		if(numbers == null) {
			System.out.println("Nothing given!");
			return 0;
		}
		else if(numbers.length<=2) {
			System.out.println("Too short!");
			return 0;
		}
		else {
			int high = numbers[0];
			int low = numbers[0];
			for(int i = 0; i<numbers.length; i++) {
				sum +=numbers[i];
				System.out.println("sum total: " + sum);
				if(numbers[i]>high){
					high = numbers[i];
				}
				else if(numbers[i]<low){
					low = numbers[i];
				}
			}
			System.out.println("max: " + high);
			System.out.println("min: " + low);
			sum = sum-(high+low);
			
		}
		System.out.println("sum: " + sum);
		return sum;
	}
	
	public static void main(String[] args) {
		sum(new int[]{1,2});
		System.out.println("---------------------------");
//		FOR NULL CHECK
		int[] numbers = null;
		sum(numbers);
		System.out.println("---------------------------");
		sum(new int[]{1,2,3,4});
		System.out.println("---------------------------");
		sum(new int[]{2,1,3,4});
		System.out.println("---------------------------");
		sum(new int[]{1,2,5,0,4});
	}

}
