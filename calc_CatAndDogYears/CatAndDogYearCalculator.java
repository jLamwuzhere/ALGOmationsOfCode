package calc_CatAndDogYears;

import java.util.Arrays;

//I have a cat and a dog. I got them at the same time as kitten/puppy. That was humanYears years ago. Return their respective ages now as [humanYears,catYears,dogYears]
//
//NOTES:
//humanYears >= 1
//humanYears are whole numbers only
//Cat Years		//15 cat years for first year			//+9 cat years for second year			//+4 cat years for each year after that
//Dog Years		//15 dog years for first year			//+9 dog years for second year			//+5 dog years for each year after that



public class CatAndDogYearCalculator {
//		//-------------METHOD 1 -----------
//	public static int[] humanYearsCatYearsDogYears(final int humanYears) {
//		System.out.println("Human age is: " + humanYears);
//		if(humanYears ==0) {
//			System.out.println("All are still 0 years");
//			System.out.println(Arrays.toString(new int[]{0,0,0}));
//			return new int[]{0,0,0};
//		}
//		else if(humanYears ==1) {
//			System.out.println("Cat and Dog are now each 15 years.");
//			System.out.println(Arrays.toString(new int[]{1,15,15}));
//			return new int[]{1,15,15};
//		}
//		else if(humanYears ==2) {
//			System.out.println("Cat and Dog are now each 24 years.");
//			System.out.println(Arrays.toString(new int[]{2,24,24}));
//			return new int[]{2,24,24};
//		}
//		else {
//			int catAge = (24 + (humanYears-2)*4);
//			System.out.println("Cat age: " + catAge);
//			int dogAge = (24 + (humanYears-2)*5);
//			System.out.println("Dog age: " + dogAge);
//			System.out.println(Arrays.toString(new int[]{humanYears,catAge,dogAge})) ;
//			return new int[]{humanYears,catAge,dogAge};
//		}
//    }

	
//	//-------------METHOD 2 - TERNARY-----------
	public static int[] humanYearsCatYearsDogYears(final int y) {
		System.out.println("Human age is: " + y);
		System.out.println(Arrays.toString(new int[]{y,y==1?15:16+4*y,y==1?15:14+5*y}));
	    return new int[]{y,y==1?15:16+4*y,y==1?15:14+5*y};
    }
	
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		humanYearsCatYearsDogYears(1);
		humanYearsCatYearsDogYears(2);
		humanYearsCatYearsDogYears(3);
		humanYearsCatYearsDogYears(4);
		humanYearsCatYearsDogYears(10);
	}
	
}
