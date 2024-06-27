package conditionalRendering_RockPaperScissors;

public class RockPaperScissors {
//	//-------------METHOD 1 - IF ELSE CHECKS STARTING WITH DRAW CONDITION -----------
//	 public static String rps(String p1, String p2) {
//		 // Draw Condition
//		 if(p1 == p2) {
//			 System.out.println("Draw!");
//			 return "Draw!";
//		 }
//		 else if(p1 =="rock") {
//			 if(p2 == "scissors") {
//			 System.out.println("Rock[p1] beats Scissors[p2]. Player 1 won!");
//			 return "Player 1 won!";
//			 }
//			 // rock vs paper
//			 else {
//				 System.out.println("Rock beat by Paper. Player 2 won!");
//				 return "Player 2 won!";
//			 }
//		 }
//		 else if (p1 =="scissors") {
//			 if(p2 == "paper") {
//				 System.out.println("Scissors beats paper. Player 1 won!");
//				 return "Player 1 won!";
//			 }
//			 // scissors vs rock
//			 else{
//				 System.out.println("Scissors beat by Rock. Player 2 won!");
//				 return "Player 2 won!";
//			 }
//				 }
//		 // P1 is paper here
//		 else{
//			 if(p2 == "rock") {
//				 System.out.println("Paper beats Rock. Player 1 won!");
//				 return "Player 1 won!";
//			 }
//			 // Paper vs scissors
//			 else {
//				 System.out.println("Paper beat by Scissors. Player 2 won!");
//				 return "Player 2 won!";
//			 }
//		}
//	 }
	 
	 
//	//-------------METHOD 2 - TERNARY FUNCTION -----------
	 public static String rps(String p1, String p2) {
		 System.out.println(p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!");
		 return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";
	 }
	 
	 
	 // --------------MAIN METHOD--------------
	 public static void main(String[] args) {
		rps("rock", "scissors");
		rps("rock", "paper");
		rps("rock", "rock");
		rps("paper", "scissors");
		rps("paper", "rock");
		rps("paper", "paper");
		rps("scissors", "paper");
		rps("scissors", "rock");
		rps("scissors", "scissors");
	}
}
