package calc_twiceAsOld;

public class TwiceAsOldCalculator {
	public static int TwiceAsOld(int dadYears, int sonYears){
		int targetAge = sonYears*2;
		System.out.println("Our target age is: " + targetAge);
		int time = targetAge-dadYears;
		System.out.println(Math.abs(time));
		if(time <0) {
			System.out.println(Math.abs(time) + " years ago");
		}
		else if(time == 0){
			System.out.println("now");
		}
		else {
			time = time*-1;
			System.out.println(Math.abs(time) + " years to go");
		}
		System.out.println(Math.abs(time));
		return Math.abs(time);
	}
	
	
	
//	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		TwiceAsOld(32,16);
		TwiceAsOld(32,8);
		TwiceAsOld(32,27);
	}
}
