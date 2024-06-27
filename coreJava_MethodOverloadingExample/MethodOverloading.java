package coreJava_MethodOverloadingExample;

public class MethodOverloading {
	//-------------METHOD 1-----------
	public static String addTogether(String fname, String lname){
		
		System.out.println("Welcome " + fname + " "+ lname + ".");
		System.out.println(fname + " " + lname);
		return fname+lname;
	}
	//-------------METHOD 2 -----------
	public static String addTogether(String lname, Integer age){
		System.out.println("Welcome " + lname + " "+ age + ".");
		System.out.println(lname + " " + age);
		return age+lname;
	}
	
//	WE CANNOT HAVE TWO STRINGS FOR INSTANCE AND JUST REVERSE THE ORDER
	
	//-------------METHOD 3 -----------
	public static int addTogether(int num1, int num2){
//														if the numbers aren't in parentheses here, it will instead concatenate them.
		System.out.println(num1 + " + " + num2 + " concat = " + num1+num2);
//														so we add the parentheses like this
		System.out.println(num1 + " + " + num2 + " summed = " + (num1+num2));
		System.out.println(num1 + num2);
		return num1 + num2;
	}
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		String fname="John";
		String lname="Doe";
		addTogether(fname, lname);
		addTogether(lname, 27);
		addTogether(6,5);
	}
}
