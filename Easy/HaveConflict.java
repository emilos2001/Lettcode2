package LeetCode.Easy;

public class HaveConflict {
    public static boolean haveConflict(String[] event1, String[] event2){
        int startingEvent1 = convertToMinutes(event1[0]);
        int endingEvent1 = convertToMinutes(event1[1]);
        int startingEvent2 = convertToMinutes(event2[0]);
        int endingEvent2 = convertToMinutes(event2[1]);
        if (endingEvent1 < startingEvent2 || endingEvent2 < startingEvent1){
            return false;
        }
        return true;
    }

    static int convertToMinutes(String time){
        String[] token = time.split(":");
        int minutes = Integer.parseInt(token[1]);
        int hours = Integer.parseInt(token[0]) * 60;
        return hours + minutes;
    }

    public static void main(String[] args) {
        String[] event1 = {"01:15", "02:00"};
        String[] event2 = {"02:00", "03:00"};
        System.out.println(haveConflict(event1, event2));


        String[] event3 = {"09:00", "10:00"};
        String[] event4 = {"10:30", "11:00"};
        System.out.println(haveConflict(event3, event4));
    }
}
