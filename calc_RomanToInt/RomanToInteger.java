package calc_RomanToInt;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//Symbol       Value
//I:1		V:5				X:10		L:50
//C:100		D:500		M:1000
//For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//I can be placed before V (5) and X (10) to make 4 and 9. 
//X can be placed before L (50) and C (100) to make 40 and 90. 
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Given a roman numeral, convert it to an integer.

public class RomanToInteger {
	
//	//-------------METHOD 1 -----------
	public static int romanNumeralToInt(String romNum) {
		System.out.println("Given: " + romNum);
		// CHECK IF THERE'S NOTHING IN THE STRING OR ONLY WHITESPACE
		if(romNum.isBlank()) {
			System.out.println("BLANK?!");
			return -1;
		}
//		CHECK IF IT'S NOT THE LETTERS WE WANT.
		if(romNum.contains("A")|romNum.contains("B")|romNum.contains("E")|romNum.contains("F")|romNum.contains("G")|romNum.contains("H")|
				romNum.contains("J")|romNum.contains("K")|romNum.contains("N")|romNum.contains("O")|romNum.contains("P")|romNum.contains("Q")|romNum.contains("R")|
				romNum.contains("S")|romNum.contains("T")|romNum.contains("U")|romNum.contains("W")|romNum.contains("Y")|romNum.contains("Z")) {
			System.out.println("Invalid Input. Accepts chars: I, V, X, L, C, D, M");
			return -1;
		}
		// CHECK FOR NUMBERS
		if(romNum.contains("1")|romNum.contains("2")|romNum.contains("3")|romNum.contains("4")|romNum.contains("5")|
				romNum.contains("6")|romNum.contains("7")|romNum.contains("8")|romNum.contains("9")|romNum.contains("0")) {
			System.out.println("Invalid Input. Accepts chars: I, V, X, L, C, D, M");
			return -1;
		}
		//CHECK FOR RANDOM CHARACTERS HERE (THIS CAN REPLACE MY NUMBER CHECKER TOO.)
//		if(romNum.contains(ASCII values that aren't capital letters)){
//			System.out.println("Invalid Input. Accepts chars: I, V, X, L, C, D, M");
//			return -1;
//		}	
		int number = 0;
		for(int i=0; i<romNum.length(); i++) {
//			int pointer = i+1;
			// CHECK IF THE CURRENT NUMBER IS 'I'
			System.out.println("Pointer: " + romNum.charAt(i));
			if(romNum.charAt(i)=='I') {
				System.out.println("found an I");
//				CHECK IF THE POINTER IS NOT AT THE END OF THE STRING
//				if(romNum.charAt(i)<romNum.length()-1) {
				if(i<romNum.length()-1) {
					System.out.println("Character at i+1: " + romNum.charAt(i+1));
//					CHECK IF THE NEXT NUMBER IS ONE OF THESE
					if(romNum.charAt(i+1) =='V'|romNum.charAt(i+1) =='X'){
						System.out.println("subtracting: 1");
						number -=1;
					}
					else if(romNum.charAt(i+1) =='L'|romNum.charAt(i+1) =='C'){
						System.out.println("subtracting: 10");
						number -=10;
					}
					else if(romNum.charAt(i+1) =='D'|romNum.charAt(i+1) =='M'){
						System.out.println("subtracting: 100");
						number -=100;
					}
//					CHECK IF THE NEXT NUMBER IS I
					else {
						System.out.println("Adding: 1");
						number+=1;
					}
				}
				// I IS AT THE END SO JUST ADD 1 TO THE TOTAL.
				else {
					System.out.println("End of string. Adding: 1");
					number +=1;
				}
			}
				// THE VALUE ISN'T I SO JUST ADD THE CORRESPONDING CHAR'S VALUE
			else if(romNum.charAt(i) =='V'){
				System.out.println("Adding: 5");
				number +=5;
			}
			else if(romNum.charAt(i) =='X'){
				System.out.println("Adding: 10");
				number +=10;
			}
			else if(romNum.charAt(i) =='L'){
				System.out.println("Adding: 50");
				number +=50;
			}
			else if(romNum.charAt(i) =='C'){
				System.out.println("Adding: 100");
				number +=100;
			}
			else if(romNum.charAt(i) =='D'){
				System.out.println("Adding: 500");
				number +=500;
			}
			else if(romNum.charAt(i) =='M'){
				System.out.println("Adding: 1000");
				number +=1000;
			}
		}
		System.out.println("The integer is: " + number);
		return number;
	}
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
//		romanNumeralToInt("II");
//		romanNumeralToInt("III");
//		romanNumeralToInt("X");
//		romanNumeralToInt("XII");
//		romanNumeralToInt("XVII");
		romanNumeralToInt("XXVII");
		System.out.println("--------------------------");
		romanNumeralToInt("IV");
		System.out.println("--------------------------");
		romanNumeralToInt("XXIX");
		System.out.println("--------------------------");
		romanNumeralToInt("IMIL");
		System.out.println("--------------------------");
		romanNumeralToInt("BC");
		System.out.println("--------------------------");
		romanNumeralToInt("37");
		System.out.println("--------------------------");
		romanNumeralToInt("   ");
		
	}
	
}




















