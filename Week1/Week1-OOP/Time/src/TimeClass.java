import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class TimeClass {

    private int month;
    private int date;
    private int year;
    private int hour;
    private int minutes;
    private int sec;

    TimeClass(int m, int d, int y, int h, int min, int s) {
        this.date = d;
        this.month = m;
        this.year = y;
        this.hour = h;
        this.minutes = min;
        this.sec = s;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public String toString() {
        String result = String.format("%d:%d:%d %d.%d.%d", hour, minutes, sec, date, month, year);
        return result;
    }

    public static TimeClass now()

    {
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance(); // creates a new
                                                             // calendar
                                                             // instance
        calendar.setTime(date); // assigns calendar to given date
        int h = calendar.get(Calendar.HOUR_OF_DAY); // gets hour in 24h format
                                                    // // gets hour in 12h
                                                    // format
        int min = calendar.get(Calendar.MINUTE);
        int s = calendar.get(Calendar.SECOND);
        int m = calendar.get(Calendar.MONTH);
        int y = calendar.get(Calendar.YEAR);
        int d = calendar.get(Calendar.DATE);

        TimeClass t = new TimeClass(m, d, y, h, min, s);

        return t;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TimeClass now = now();
        System.out.println(now.toString());
    }

}


/*
 * class Factory{
 * public static Base createBase()
 * {
 *      //predikati
 *      return new Base(); // ako priema parametri, ne e nujno da se pishat
 * }
 * }
*izpolzvame posle Base b3 = Factory.createBase();
*vmesto Base bb = new DerivedClass();
*
*osven tova promenqme samo na edno masto v koda, a ne obhojdame vsichki
*nasledeni klasove
*/
