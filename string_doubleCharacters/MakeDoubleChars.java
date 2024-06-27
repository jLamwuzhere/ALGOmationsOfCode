package string_doubleCharacters;

public class MakeDoubleChars {
//	//-------------METHOD 1 - STRINGBUILDER-----------
	public static String doubleChar(String s){
		StringBuilder doubleString = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			doubleString.append(s.charAt(i));
			doubleString.append(s.charAt(i));
		}
		System.out.println(doubleString);
		return doubleString.toString();
	}
	
//	//-------------METHOD 2 - REGEX-----------
//	public static String doubleChar(String s){
//		System.out.println(s.replaceAll(".", "$0$0"));
//		return s.replaceAll(".", "$0$0");
//	}
	
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		doubleChar("ss");
		doubleChar("sos");
	}
}
