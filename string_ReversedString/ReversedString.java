package string_ReversedString;

public class ReversedString {
//-------------METHOD 1 - STRING -----------
//	Works fine, but immutable. Best for static or rarely changed info. Also increases performance overhead; i.e. decreasing performance with many Strings.
	public static String solution(String str) {
//		create a new String called "reversed" to hold the values
	    String reversed = new String();
//	    loop through the given string backwards
	    for(int i= str.length()-1; i>=0;  i--) {
//	    	push each character into "reversed"
	    	reversed += str.charAt(i);
	    }
//	    print out "reversed"
	    System.out.println(reversed);
//	    return the reversed String
	    return reversed;
	}
	
	
////-------------METHOD 2 - STRING BUFFER METHOD-----------
////		-Thread-safe but slower.
//	public static String solution(String str) {
//		  //didn't choose StringBuilder because it's not thread-safe
//				System.out.println(new StringBuffer(str).reverse().toString());
//			    return new StringBuffer(str).reverse().toString();
//	}
	
	
////-------------METHOD 3 - STRING BUILDER METHOD-----------
////		- Not thread-safe, but much faster than StringBuffer. Still better than String.
//	public static String solution(String str) {
//	    StringBuilder res = new StringBuilder(str.length());
//	    
//	    for (int i = (str.length() - 1); i >= 0; i--){
//	      res.append(str.charAt(i));
//	    }
//	    System.out.println(res);
//	    return res.toString();
//	  }
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
		solution("bob");
		solution("macaroni");
		solution("tacocat");
	}
}