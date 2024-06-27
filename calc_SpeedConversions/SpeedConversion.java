package calc_SpeedConversions;

//The cockroach is one of the fastest insects. Write a function which takes its speed in km per hour and returns it in cm per second, rounded down to the integer (= floored).
//
//For example:				//1.08 --> 30				//Note! The input is a Real number (actual type is language dependent) and is >= 0. The result should be an Integer.

public class SpeedConversion {
//	//-------------METHOD 1 -----------
	public static int cockroachSpeed(double x){
		System.out.println("The cockroach's speed is: " + (int) Math.floor(x*100000/3600) + "cm/second");
//		multiply by 100,000 to get cm and then divide by 3600 to get seconds(convert to 60minutes and 60 seconds respectively)
	    return (int) Math.floor(x*100000/3600); 
    }
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		cockroachSpeed(1.08);
		cockroachSpeed(50);
	}

}
