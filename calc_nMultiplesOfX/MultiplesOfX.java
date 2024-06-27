package calc_nMultiplesOfX;

//import java.util.Arrays;					// FOR METHOD 1
import java.util.stream.IntStream;			//FOR METHOD 2

public class MultiplesOfX {
	//-------------METHOD 1 -----------
//	public static int[] countBy(int x, int n){
//		if(n <0) {
//			System.out.println("n must be POSITIVE");
//			return null;
//		}
//		else {
//			int[] result = new int[n];
//			int sum = 0;
//			for(int i= 0; i<n; i++) {
//				result[i]= (sum +=x);
//			}
//			System.out.println(Arrays.toString(result));
//			return result;
//		}
//	}
	
	//-------------METHOD 2 - STREAMS -----------
	public static int[] countBy(int x, int n){
		if(n <0) {
			System.out.println("n must be POSITIVE");
			return null;
		}
		else {
			System.out.println(java.util.Arrays.toString(IntStream.iterate(x, i -> i + x)
                    .limit(n)
                    .toArray()));
			}
			return java.util.stream.IntStream.iterate(x,i->i+x).limit(n).toArray();
		}
	
	  //MAIN METHOD
	  public static void main(String[] args) {
		countBy(2,5);
		countBy(12,3);
		countBy(0,5);
		countBy(-2,5);
		countBy(2,-5);
	  }
}
