package string_ToUppercase;

public class MakeStringUppercase {
//					METHOD 1 - TO UPPER CASE
  public static String makeUpperCase(String str){
	  if(str.toUpperCase() == str) {
		  System.out.println("The string " + str + " is already uppercase.");
		  return str;
	  }
	  else {
		System.out.println(str.toUpperCase());
	    return str.toUpperCase();
	  }
  }
  
//////  					METHOD 2 - BRUTE FORCE ----NOT RECOMMENDED UNLESS REQUIRED TO DO THIS WAY!!!!!!
//  public static String makeUpperCase(String str){
//    String strA = str.replace("a","A");
//    String strB = strA.replace("b","B");
//    String strC = strB.replace("c","C");
//    String strD = strC.replace("d","D");
//    String strE = strD.replace("e","E");
//    String strF = strE.replace("f","F");
//    String strG = strF.replace("g","G");
//    String strH = strG.replace("h","H");
//    String strI = strH.replace("i","I");
//    String strJ = strI.replace("j","J");
//    String strK = strJ.replace("k","K");
//    String strL = strK.replace("l","L");
//    String strM = strL.replace("m","M");
//    String strN = strM.replace("n","N");
//    String strO = strN.replace("o","O");
//    String strP = strO.replace("p","P");
//    String strQ = strP.replace("q","Q");
//    String strR = strQ.replace("r","R");
//    String strS = strR.replace("s","S");
//    String strT = strS.replace("t","T");
//    String strU = strT.replace("u","U");
//    String strV = strU.replace("v","V");
//    String strW = strV.replace("w","W");
//    String strX = strW.replace("x","X");
//    String strY = strX.replace("y","Y");
//    String strZ = strY.replace("z","Z");
//    System.out.println(strZ);
//  return strZ;  
//  }
  
//	--------------MAIN METHOD--------------
  public static void main(String[] args) {
      makeUpperCase("bob was here");
      makeUpperCase("NULL");
  }
}
