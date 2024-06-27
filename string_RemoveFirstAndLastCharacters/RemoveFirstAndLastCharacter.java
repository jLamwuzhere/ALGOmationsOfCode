package string_RemoveFirstAndLastCharacters;

									// GOAL
//GIVEN A STRING, REMOVE THE FIRST AND LAST CHARACTERS
//THE SCENARIO IS AS ABOVE. JOE GIVES O, ALPHABET GIVES LPHABE, ETC.

public class RemoveFirstAndLastCharacter {

    public static String remove(String str) {
        // Check if the length is greater than 2
        if (str.length() > 2) {
            // Change the string to actually make it the substring
            str = str.substring(1, str.length() - 1);
            System.out.println(str);
            return str;
        }
        // If the length is not greater than 2:
        else {
            // Return the original string.
            System.out.println("Too short!");
            return str;
        }
    }

    public static void main(String[] args) {
        // Givens:
        // eloquent
//    	This line is if we didn't print in our method
//      System.out.println(remove("eloquent"));
//    	Since we did print in our method, we can simply call the method.
        remove("eloquent");
    }
}