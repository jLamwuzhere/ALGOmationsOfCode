//Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), 
//Adenine ('A'), and Thymine ('T').
//Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is 
//replaced by another nucleic acid Uracil ('U').

//Create a function which translates a given DNA string into RNA.
//For example:
//"GCAT"  =>  "GCAU"
//The input string can be of arbitrary length - in particular, it may be empty. All input is guaranteed to be valid, i.e. 
//each input string will only ever consist of 'G', 'C', 'A' and/or 'T'.


package string_Replacer_DnaConversions;

import java.util.Objects;			// FOR METHOD 4

public class DNAtoRNA {
//	//-------------METHOD 1 -----------
//	public String dnaToRna(String dna) {
//		System.out.println("Given: " + dna);
//		String rna = dna.replace("T", "U"); 
//		System.out.println(rna);
//        return rna;  // Do your magic!
//    }
	
	
//	//-------------METHOD 2 - CLEANER VERSION-----------
//	public String dnaToRna(String dna) {
//		System.out.println("Given: " + dna);
//		System.out.println(dna.replace("T", "U"));
//		return dna.replace("T", "U"); 
//    }
	
//	//-------------METHOD 3 - FOR LOOP -----------
//	public String dnaToRna(String dna) {
//		System.out.println("Given: " + dna);
//        String rna = "";
//        String[] dna2 = dna.split("");
//        for (int i = 0; i < dna2.length; i++){
//            if(dna2[i].contains("T")){
//                dna2[i] = "U";
//            }
//            rna += dna2[i];
//        }
//        System.out.println(rna);
//        return rna;
//    }
	
	
	//-------------METHOD 4 - INTSTREAMS -----------
	public String dnaToRna(String dna) {
		System.out.println("Given: " + dna);
		System.out.println(dna
//        		Convert to IntStream of Unicode points of chars (Integers representing UniCode values)
                .chars()
//              Maps each Unicode point to a string representation. Lambda converts it back into character representation
                .mapToObj(c -> Character.toString((char)c))
//              Maps all "T" to "U"
                .map(c -> Objects.equals("T", c) ? "U" : c)
//              Reduce turns them back into a single string, adding each char at a time to that String
                .reduce("", (a, b) -> a + b));
        return dna
                .chars()
                .mapToObj(c -> Character.toString((char)c))
                .map(c -> Objects.equals("T", c) ? "U" : c)
                .reduce("", (a, b) -> a + b);
    }
	
	
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
        DNAtoRNA converter = new DNAtoRNA();
        converter.dnaToRna("GCAT");
        converter.dnaToRna("TCAT");
    }
		
}
