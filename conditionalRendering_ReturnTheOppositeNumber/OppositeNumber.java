package conditionalRendering_ReturnTheOppositeNumber;

public class OppositeNumber {
    public static int opposite(int number)
    {
//    	Check to see if it's a positive integer using math.absolute function.
        if(Math.abs(number) == number){
//        If so, just append a negative sign to the front of the number.
          return -number;
        }
//      If the integer isn't positive:
        else{
//        Simply return the absolute of that integer.
          return Math.abs(number);
        }
    }
    public static void main(String[] args) {
    	// Givens:
    	// eloquent
//    	We aren't printing in our method, so me must print upon calling the method.
    	System.out.println(opposite(-1771));
    	System.out.println(opposite(1771));
    }
}