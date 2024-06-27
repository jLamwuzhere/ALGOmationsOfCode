package calc_AddDigits;

public class AddDigitsOfAnInteger {
//	//-------------METHOD 1 - MODULATOR OF 10 -----------
	public static int sumDigits(int n) {
		int sum = 0;
		int whatsLeft = 0;
		while(n !=0) {
//			sum = sum*10 + n%10;
			sum += n%10;
			n = n/10;
		}
		System.out.println(sum);
		return sum;
	}
	
//	//-------------METHOD 1 - MODULATOR OF 10 -----------
//	public static int digitSum(int n) {
//		
//	}
	
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
		sumDigits(123);
		sumDigits(111);
		sumDigits(999);
		sumDigits(000);
	}

}
