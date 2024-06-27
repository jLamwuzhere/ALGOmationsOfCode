package string_removeStringSpaces;

public class RemoveSpaces2 {
	public static String removeWhiteSpace(String s) {
//		String fixed = s.replaceAll("\\s", "");
		String fixed = s.replaceAll(" ", "");
		
		System.out.println(fixed);
		return fixed;
	}
	
	public static void main(String[] args) {
		removeWhiteSpace("His name is Abdi.");
	}
}
