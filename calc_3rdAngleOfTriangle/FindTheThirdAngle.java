package calc_3rdAngleOfTriangle;

public class FindTheThirdAngle {
//	//-------------METHOD 1 - CALCULATION-----------
	public static int otherAngle(int angle1, int angle2) {
		if(angle1 + angle2 > 180) {
			System.out.println("Error! Too Big. Angle total must be less than or equal to 180 degrees to make a triange :-(");
			return 0;
		}
		else if( angle1 < 0| angle2 < 0) {
			System.out.println("Error! Too small. Angles must be greater than or equal to 0 degrees to make a triange :-(");
			return 0;
		}
		else{
			int third = 180 - angle1 - angle2;
			System.out.println("The 3rd angle will be " + third + " degrees");
			return third;
		}
    }
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		otherAngle(30, 20);
		otherAngle(175, 10);
		otherAngle(100, 20);
		otherAngle(-2, 20);
	}

}
