package gridArray_NoOverlappingMeetings;

public class CanYouAttendWithSortedMeetings {
	public static boolean canAttendAllMeetings(int[][] events) {
//    	if (events[pointer1][1] <= events[pointer2][0]) {
		int pointer1 = 0;
    	int pointer2 = pointer1+1;
    	while(pointer1<events.length-1) {
    		if(events[pointer1][1]>events[pointer2][0]) {
    			System.out.println(false);
    			return false;
    		}
    		else {
    			pointer1++;
    			pointer2++;
    		}
    	}
    	
    	System.out.println(true);
		return true;
	}
	
	
//	--------------MAIN METHOD--------------
    public static void main(String[] args) {
        int[][] exampleEvents = {
                {0, 30},
                {5, 10},
                {15, 20}
        };
        canAttendAllMeetings(exampleEvents);
        System.out.println("-------------------------------");
        canAttendAllMeetings(new int[][]{{0, 10},{5, 20},{15, 20}});
        System.out.println("-------------------------------");
        canAttendAllMeetings(new int[][]{{0, 10},{11, 15},{16, 20}});
        
    }

}
