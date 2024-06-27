package gridArray_NoOverlappingMeetings;

public class MeetingSchedulerUnsorted {

    public static boolean isAttendingMeetings(int[][] events) {
        int pointer1 = 0;
        int pointer2 = pointer1 + 1;

        // Sort events by their start times
        java.util.Arrays.sort(events, java.util.Comparator.comparingInt(a -> a[0]));

        while (pointer1 < events.length - 1) {
            if (events[pointer1][1] > events[pointer2][0]) {
                System.out.println(false);
                return false;
            }
            pointer1++;
            pointer2++;
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
        isAttendingMeetings(exampleEvents);
        isAttendingMeetings(new int[][] {{15, 20},{0, 10},{5, 20}});
        isAttendingMeetings(new int[][] {{11, 15},{0, 10},{16, 20}}); 
    }
}
