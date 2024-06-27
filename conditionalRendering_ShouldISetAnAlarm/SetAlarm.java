package conditionalRendering_ShouldISetAnAlarm;


							// GOAL
//GIVEN A SET OF CONDITIONS, DETERMINE IF THE OUTPUT IS TRUE OR FALSE.
//THE SCENARIO IS DECIDING TO SET AN ALARM BASED ON IF YOU ARE EMPLOYED AND ON VACATION.


public class SetAlarm {
////	-------------METHOD 1 - CHECKING ONLY CONDITIONS FOR TRUE AND THEN RETURN FALSE------------
//	public static boolean setAlarm(boolean employed, boolean vacation) {
////		Check if you are employed.
//		if(employed == true) {
////			If you are employed, check if you are not on vacation.
//			if(vacation == false) {
////				If both are true, the answer is true
//				System.out.println("Yes, you should set an alarm.");
//				return true;
//			}
//		}
////		All other conditions should return false.
//		System.out.println("No alarm needed.");
//		return false;
//	}
	
	
//	-------------METHOD 2 - CLEAN VERSION------------
	public static boolean setAlarm(boolean employed, boolean vacation) {
//		Checks for the true condition and is a boolean in itself.
//		If this is true, it returns true. If it's false, it returns false
//		-This is how it works as only one check to handle them all.
		System.out.println(employed && !vacation);
	    return employed && !vacation;
    }
	
	
	// --------------MAIN METHOD--------------
	public static void main(String[] args) {
        setAlarm(true, false);
        setAlarm(true, true);
        setAlarm(false, true);
        setAlarm(false, false);
    }
}
