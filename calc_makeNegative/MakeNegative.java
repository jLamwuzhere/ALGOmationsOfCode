package calc_makeNegative;

//import static java.lang.Math.abs;  // FOR METHOD 3

public class MakeNegative {
//	//-------------METHOD 1 - CALCULATION-----------
	 public static int makeNegative(final int x) {
		 System.out.println("Given: " + x);
		 if(x >=0) {
			 System.out.println("making negative... " + x); 
			 return -1*x;
		 }
		 System.out.println("Already negative " + x);
		 return x; // Your code here.}
	 }
		//-------------METHOD 2 - TERNARY-----------
//	public static int makeNegative(final int x) {
//		System.out.println("Given: " + x);
//		System.out.print("making negative... ");
//		System.out.println(x <=0 ?  x : x *-1);
//		return x <=0 ?  x : x *-1;
//	}
	
//	//-------------METHOD 3 - NEGATIVE ABSOLUTE-----------
//	public static int makeNegative(final int x) {
//		System.out.println("Given: " + x);
//		System.out.print("making negative... ");
//		System.out.println(-abs(x));
//		return -abs(x);
//	}
	 
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		makeNegative(0);
		makeNegative(40);
		makeNegative(-12);
		makeNegative(2);
	}
}
