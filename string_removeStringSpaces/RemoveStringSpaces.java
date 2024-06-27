package string_removeStringSpaces;

public class RemoveStringSpaces {
//	//-------------METHOD 1 - IF-ELSE STATEMENT -----------
	public static String noSpace(final String x) {
		System.out.println("Given: " + x);
		String spaceless = new String();
		int count = 0;
		if( x.isEmpty()) {
			System.out.println("EMPTY!");
			return null;
		}
		else {
			for(int i=0; i<x.length(); i++) {
				count ++;
				if(x.charAt(i) != ' ') {
					spaceless += x.charAt(i);
				}
			} 
		}
		System.out.println(count);
		System.out.println(spaceless);
		return spaceless;
    }
	
//	//-------------METHOD 2 - STRING + REPLACE ALL -----------
//	public static String noSpace(final String x) {
//		System.out.println(x);
//		String spaceless = new String(x.replaceAll(" ", ""));
//		System.out.println(spaceless);
//        return spaceless;
//    }
	
//	//-------------METHOD 3 - ????? -----------
//	public static String noSpace(final String x) {
//		
//        return x;
//    }
	
	//-------------MAIN METHOD -----------
		public static void main(String[] args) {
			noSpace("fjldj dlsja dj");
			System.out.println("----------------");
			noSpace(" ");
			System.out.println("----------------");
			noSpace("");
			System.out.println("----------------");
			noSpace("fjldj dlsja dj");
			System.out.println("----------------");
			noSpace("hey yo");
			System.out.println("----------------");
			noSpace("cat as trophe");
		}
}
