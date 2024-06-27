package array_OddOneOut;

import java.util.Arrays;

//Given an array of numbers, find the odd one in the set.

public class StrayNumber {
	static int stray(int[] numbers) {
		System.out.println("Given: " + Arrays.toString(numbers));
//		SET 3 VARIABLES TO TRACK FIRST 3 INDEX POSITIONS
		int first = 0;
		int test = first+1;
		int test2 = test+1;
//		CASE FOR LENGTH OF 2
		if(numbers.length==2) {
//			IF NUMBERS ARE THE SAME
			if(numbers[first]==numbers[test]) {
				System.out.println("SAME!");
				return -1;
			}
			else{
//				IF BOTH ARE DIFFERENT
				System.out.println("BOTH DIFFERENT!");
				return 0;
			}
		}
//		NORMAL CASE
		while(numbers[first]<numbers.length-1){
//			CHECK IF FIRST 2 NUMBERS ARE EQUAL
			if(numbers[first] == numbers[test]) {
//				CHECK THAT FIRST IS 3 POSITIONS FROM THE END OF THE ARRAY
				if(first == numbers.length-2) {
//					CHECK IF THE OTHER 2 ARE SAME
					if(numbers[first] == numbers[test2]) {
						System.out.println("SAME!");
						break;
					}
//					IF THEY AREN'T THE SAME, THAT MAKES TEST 2 THE STRAY
					else {
						System.out.println("Stray index pos: " + test2 + "; value: " + numbers[test2]);
						return test2;
					}
				}
//				IF THE FIRST IS LONGER THAN 3 POSITIONS FROM THE END
				else{
//					LOGIC HERE
					System.out.println("HERE");
					first++;
				}
			}
//			FOR WHEN FIRST AND SECOND POSITIONS ARE DIFFERENT
			else {
//				IF FIRST AND 3RD ARE ALSO DIFFERENT, WE RETURN THE FIRST
				if(numbers[first] != numbers[test2]) {
					if(first == numbers.length-2) {
						System.out.println("Stray index pos: " + first + "; value: " + numbers[first]);
						return numbers[first];
					}
//					OTHERWISE WE KNOW TO RETURN THE SECOND
					else {
						System.out.println("Stray index pos: " + test + "; value: " + numbers[test]);
						break;
						
					}
				}
//				else {
//					first++;
//				}
			}
		}
		System.out.println("NO odds");
		return 0;
	  }
	
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
		stray(new int[]{1, 1});
		stray(new int[]{1, 2});
		stray(new int[]{1, 1, 2});
		stray(new int[]{1, 1, 2, 1, 1});
		stray(new int[]{1, 2, 2, 2, 2});
		stray(new int[]{100, 1, 1, 1, 1});
		stray(new int[]{100, 100, 100, 100, 1000});
	}

}
