import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MonthWiseDate {
    public static void main(String[] args) {
        String date1 = "JAN-2016";
        String date2 = "NOV-2017";

        DateFormat formater = new SimpleDateFormat("MMM-yyyy");

        Calendar beginCalendar = Calendar.getInstance();
        Calendar finishCalendar = Calendar.getInstance();

        try {
            beginCalendar.setTime(formater.parse(date1));
            finishCalendar.setTime(formater.parse(date2));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        while (beginCalendar.before(finishCalendar)) {
            // add one month to date per loop
            String date =     formater.format(beginCalendar.getTime()).toUpperCase();
      
            int mon = beginCalendar.get(Calendar.MONTH) + 1;
            int yy = beginCalendar.get(Calendar.YEAR);
            
         //   System.out.println("Month is" + mon);
           // System.out.println("Year is" + yy);
            System.out.println("raw/prod/idm/events/hilton/year="+yy + "/month="+mon);
            beginCalendar.add(Calendar.MONTH, 1);
        }
    }
}