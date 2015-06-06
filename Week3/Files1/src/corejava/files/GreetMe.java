package corejava.files;

public class GreetMe {
    public static String greet(DayOfWeek day) {
        String greeting = null;
        if (day == DayOfWeek.MONDAY) {
            greeting = "hai";
        } else if (day == DayOfWeek.TUESDAY) {
            greeting = "hello";
        } else if (day == DayOfWeek.TUESDAY) {
            greeting = "hi der";
        } else if (day == DayOfWeek.WEDNESDAY) {
            greeting = "hi";
        } else if (day == DayOfWeek.THURSDAY) {
            greeting = "Top of the morning to ya!";
        } else if (day == DayOfWeek.FRIDAY) {
            greeting = "Greetings!";
        } else if (day == DayOfWeek.SATURDAY) {
            greeting = "hallo";
        } else if (day == DayOfWeek.SUNDAY) {
            greeting = "hiiiiiii";
        }
        return greeting;
    }

    public static void main(String[] args) {
        System.out.println(greet(DayOfWeek.THURSDAY));
    }
}
