package string_correctCharRecognitionErrors;

public class CorrectTheMistakes {
//	//-------------METHOD 1 - REPLACE -----------
	public static String correct(String string) {
		System.out.println("Given: " + string);
		if(string ==null || string.isEmpty()) {
			System.out.println("Empty String, Buddy!");
		    return string;
	    }
		String corrected = new String(string.replace('5', 'S').replace("0", "O").replace("1", "I"));
		System.out.println("Corrected version: " + corrected);
		return corrected;
	}
	
//	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		correct("505");
		correct("1ncorrect");
		correct("00P5");
		correct("");
	}
}
