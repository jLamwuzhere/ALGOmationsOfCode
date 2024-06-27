package string_Comparing2Strings;

public class Compare2Strings {
//	//-------------METHOD 1 - .EQUALS IF ELSE STATEMENTS -----------
//	static String greet(String name, String owner) {
//		// We must use .equals for Strings. This is because == points to the object references.
//		if(name.equals(owner)){
//			System.out.println("Hello Bossman " + name + "!");
//			return "Hello boss";
//		}
//		else{
//			System.out.println("Hello worker " + name + ".");
//			return "Hello guest";
//		}
//	}
	
	
//	//-------------METHOD 2 - TERNARY FUNCTION -----------
//	static String greet(String name, String owner) {
//		System.out.println(name.equals(owner) ? "Hello boss" : "Hello guest");
//		// Does the name equal owner?  If so			If not
//        return name.equals(owner) ? "Hello boss" : "Hello guest";
//    }
	
	
//	//-------------METHOD 3 - CLEANER TERNARY FUNCTION -----------
	static String greet(String name, String owner) {
		System.out.println("Hello " + (name.equals(owner) ? "boss":"guest"));
        return "Hello " + (name.equals(owner) ? "boss":"guest");
    }
	
	
	// --------------MAIN METHOD--------------
	 public static void main(String[] args) {
		greet("Jeff", "Jeff");
		greet("Jeff", "Nick");
	}
}
