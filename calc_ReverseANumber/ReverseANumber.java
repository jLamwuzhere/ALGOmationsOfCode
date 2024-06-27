package calc_ReverseANumber;

public class ReverseANumber{
//	//-------------METHOD 1 - Algorithm -----------
	public static int reverseInt(int n) {
		System.out.println("Given: " + n);
		int reversed = 0;
		
		while(n !=0) {
			reversed = reversed*10 + n%10;
			System.out.println("Reversed is now: " + reversed);
			n = n/10;
			System.out.println("n is now: " + n);
		}
		System.out.println(reversed);
		return reversed;
	}
	
//	//-------------METHOD 2 - String Buffer with Value of-----------
	public static StringBuffer stringBufferRevInt(int n) {
		StringBuffer str = new StringBuffer(String.valueOf(n));
		StringBuffer reversed = str.reverse();
		System.out.println(reversed);
		return str;
	}
	
	
//	//-------------METHOD 3 - String Buffer -----------
	public static StringBuffer stringBufferReversedInt(int n) {
		StringBuffer sb = new StringBuffer();
		sb.append(n).reverse();
		System.out.println(sb);
		return sb;
	}
	
	
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		System.out.println("Method 1");
		reverseInt(12);
		System.out.println("--------------");
		reverseInt(12345);
		System.out.println("--------------");
		System.out.println("Method 2");
		stringBufferReversedInt(1234);
		System.out.println("Method 3");
		stringBufferRevInt(987);
	}
}
