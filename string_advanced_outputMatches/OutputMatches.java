package string_advanced_outputMatches;

public class OutputMatches {
	public static int matchCount(String str) {
		System.out.println("Given: " + str);
//		CREATE A LOWERCASE VERSION OF THE STRING FOR COMPARISON.
//		String lowerABC ="abcdefghijklmnopqrstuvwxyz";
		String upperABC ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder subString = new StringBuilder();
		int count = 0;
		for(int i=0; i<str.length()-1; i++) {
			System.out.println("currently at position: " + i + " : " + str.charAt(i));
//			CHECK IF CHAR AT CURRENT STRING IS LOWERCASE AND NEXT POSITION IS UPPERCASE
			if(Character.isLowerCase(str.charAt(i)) && Character.isUpperCase(str.charAt(i+1))) {
				System.out.println("Test case 1");
                System.out.println("Found a test character for case 1: " + str.charAt(i));
//                IF SO
                if(Character.toUpperCase(str.charAt(i))==str.charAt(i+1)) {
                	count++;
                	System.out.println("Pass! count is now: " + count);
                }
                else {
                	System.out.println("Not a candidate.");
                }
			}
			else if(Character.isLowerCase(str.charAt(i)) && Character.isLowerCase(str.charAt(i+1))) {
				System.out.println("TestCase 2");
				subString.append(str.charAt(i));
				int start = i;
				for(int j = start; j<str.length()-1;j++) {
//					System.out.println("xxjo");
					if(Character.isLowerCase(str.charAt(j)) && Character.isLowerCase(str.charAt(j+1))) {
						subString.append(str.charAt(j+1));
					}
				}
				System.out.println("new substring: " + subString);
//				now we need to loop through the length of the uppercase ones and compare them
//				SET A VARIABLE CALLED compare THAT SIMPLY TELLS US WHERE TO START COMPARING
				int compare = start + subString.length();
//				USE THAT compare TO WRITE OUR FOR LOOP
				for(int k=compare; k<compare+subString.length()-1; k++) {
					for(int m = 0; m<subString.length()-1; m++) {
//					IF K DOESN'T GO BEYOND str'S LENGTH,
						if(k<str.length()-1) {
							System.out.println("hey over here!");
							System.out.println(Character.toUpperCase(str.charAt(k)));
							while(str.charAt(k) == Character.toUpperCase(subString.charAt(m)) && k<str.length()-1) {
								System.out.println(":-)");
								count++;
								System.out.println("Count: " + count);
								if(k<str.length()) {
									k++;
								}
							}
						}	
					}
				}
				System.out.println("compare is " + compare);
//			NOW THAT WE HAVE OUR SUBSTRING, WE CAN COMPARE IT TO WHAT'S NEXT
			subString.setLength(0);
			}
//			else {
//				continue;
//			}
		}
//				count++;
		System.out.println("Total count is: " + count);
		return count;
	}
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		matchCount("abc");
		System.out.println("-----------------------------------------------");
		matchCount("aAbBcC");
		System.out.println("-----------------------------------------------");
		matchCount("aaaAAA");
		System.out.println("-----------------------------------------------");
		matchCount("abAB");
		System.out.println("-----------------------------------------------");
//		matchCount("ABcd");
//		System.out.println("-----------------------------------------------");
//		matchCount("aAbBcC");
	}

}
