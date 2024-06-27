package conditionalRendering_KeepingTrackOfWinsLossesAndTies;

public class TotalScore {
	
//		-------------METHOD 1 - TEST-------------
	public static int points(String[] games) {
//		VARIABLE FOR HOLDING TOTAL POINTS
		int points = 0;
//		LOOPING THROUGH OUR LIST
		for(int i=0; i<games.length; i++) {
			if(games[i].charAt(0) > games[i].charAt(2)) {
//				WIN:
				System.out.println("Match " + i + " : WIN: 3 points! GG!");
				points +=3;
			}
			else if(games[i].charAt(0) < games[i].charAt(2)) {
//				LOSS:
				System.out.println("Match " + i + " : LOSS: 0 points. Better luck next time!");
				points +=0;
			}
			else {
//				TIE:
				System.out.println("Match " + i + " : TIE: 1 point. ...");
				
				points +=1;;
			}
		}
		System.out.println("Your match total points are: " + points + " points");
		return points;
	}
	

////	-------------METHOD 2 - TERNIARY QUICK AND DIRTY-------------
//	public static int points(String[] games) {
//        int sum = 0;
//        
//        for (String s : games) {
//          char x = s.charAt(0),
//               y = s.charAt(2);
//          
//          sum += x > y ? 3 : x == y ? 1 : 0;
//        }
//        System.out.println("Your match total points are: " + sum + " points");
//        return sum;
//    }
	
//		--------------MAIN METHOD--------------
  public static void main(String[] args) {
	  points(new String[]{"1:0","2:0","3:0"});
	  points(new String[]{"1:1","2:0","3:0"});
	  points(new String[]{"1:2","2:4","3:3"});
  }
}
