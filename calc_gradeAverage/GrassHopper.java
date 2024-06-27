package calc_gradeAverage;

public class GrassHopper {
//	//-------------METHOD 1 -----------
	public static char getGrade(int s1, int s2, int s3) {
		int gradePoint = (s1 + s2 + s3)/3;
		System.out.println("This student's average score is " +gradePoint);
		char letterGrade = ' ';
		if(gradePoint>=90) {
			letterGrade = 'A';
		}
		else if(gradePoint >=80) {
			letterGrade = 'B';
		}
		else if(gradePoint >=70) {
			letterGrade = 'C';
		}
		else if(gradePoint >=60) {
			letterGrade = 'D';
		}
		else{
			letterGrade = 'F';
		}
		System.out.println("This student's letter grade is: " + letterGrade);
        return letterGrade;
    }
	
//	//-------------METHOD 2 - TERNARY STATEMENTS CHAINED -----------
//	public static char getGrade(int s1, int s2, int s3) {
//        s1=(s1+s2+s3)/3;
//        System.out.println("This student's average score is " +s1);
//        System.out.println("This student's letter grade is: " + (s1 >= 90 ? 'A':s1 >= 80 ? 'B':s1 >= 70 ? 'C':s1 >= 60 ? 'D':'F'));
//        return s1 >= 90 ? 'A':s1 >= 80 ? 'B':s1 >= 70 ? 'C':s1 >= 60 ? 'D':'F';
//    }
	
//	//-------------METHOD 3 - CHAR AT METHOD -----------
//	public static char getGrade(int s1, int s2, int s3) {
//		System.out.println("This student's letter grade is: " + "FFFFFFDCBAA".charAt((s1+s2+s3)/30));
//	    return "FFFFFFDCBAA".charAt((s1+s2+s3)/30);
//    }
	
	
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		getGrade(20,20,20);
		getGrade(100,40,100);
	}
}
