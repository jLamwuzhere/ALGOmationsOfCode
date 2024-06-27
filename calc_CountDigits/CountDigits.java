package calc_CountDigits;

import java.util.List;
import java.util.stream.Collectors;

public class CountDigits {
//	//-------------METHOD 1 - DIVIDE BY 10 -----------
	public static int countDigits(int n) {
		System.out.println("Given: " + n);
		int count = 0;
		while(n !=0) {
//			count = count*10 + n%10;
//		System.out.println("count: " + count);
			n = n/10;
			count ++;
//		System.out.println("increment " + increment);
		}
		System.out.println("final count: " + count);
		return count;
	}
	
//	//-------------METHOD 2 - STRING LENGTH -----------
	public static int countDigits2(int n) {
		System.out.println("Given: " + n);
		int count = 0;
		String intString = Integer.toString(n);
		System.out.println(intString.length());
		return intString.length();
	}
	
//	//-------------METHOD 3 - STREAMS -----------
	 public static int countDigits3(int n) {
		 System.out.println("Given: " + n);
	        // Convert the number to a string
	        String numberStr = Integer.toString(Math.abs(n));
	        
	        // Use streams to count the number of digits
	        long count = numberStr.chars()
	              .filter(Character::isDigit)
	              .count();
	        System.out.println(count);
	        return (int) count;
	    }
	 
	 public static int countDigits4(int n) {
		 System.out.println("Given: " + n);
	        // Convert the number to a string and then to a stream of characters
	        List<Character> digits = Integer.toString(Math.abs(n))
	                 .chars()
	                 .mapToObj(c -> (char) c)
	                 .collect(Collectors.toList());
	        
	        System.out.println(digits.size());
	        // Return the size of the list, which is the count of digits
	        return digits.size();
	    }
	
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
		System.out.println("METHOD 1");
		countDigits(1);
		countDigits(5);
		countDigits(12345);
		System.out.println("--------------------");
		System.out.println("METHOD 2");
		countDigits2(1234);
		countDigits2(14);
		countDigits2(12345676);
		System.out.println("--------------------");
		System.out.println("METHOD 3");
		countDigits3(124);
		countDigits3(84);
		countDigits3(12345676);
		System.out.println("--------------------");
		System.out.println("METHOD 4");
		countDigits4(123444);
		countDigits4(1);
		countDigits4(123);
	}
}
