package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {
    public static Date getDateUsingMMMDDYYYY(String dateString) {
        SimpleDateFormat makeDateFormat = new SimpleDateFormat("MMM dd, yyyy");
        Date date = null; // creates Date object using String
        try {
            date = makeDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Date getDateUsingMMMMDDYYYY(String dateString) {
        SimpleDateFormat makeDateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        Date date = null; // creates Date object using String
        try {
            date = makeDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String getCurrentDateValue() {
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("d");
        return df.format(now);
    }
    public static String getCurrentTimeInHourValue() {
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("ha");
        return df.format(now);
    }

    public static String getTomorrowDateValue() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        SimpleDateFormat df = new SimpleDateFormat("d");
        return df.format(cal.getTime());
    }

    public static String getYesterdayDateValue() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        SimpleDateFormat df = new SimpleDateFormat("d");
        return df.format(cal.getTime());
    }

    public static String getDateValueXDaysFromToday(int count) {
        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.DATE, count);
        SimpleDateFormat df = new SimpleDateFormat("d");
        return df.format(cal.getTime());
    }

    public static String getDateValueXDaysFromAnyDate(String givenDate, int count) throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat articleDateFormat = new SimpleDateFormat("d");
        Date articleDate = articleDateFormat.parse(givenDate);
        cal.setTime(articleDate);
        cal.add(Calendar.DATE, count);
        SimpleDateFormat df = new SimpleDateFormat("d");
        return df.format(cal.getTime());
    }

    public static String setAnyGivenDate(String givenDate) throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat articleDateFormat = new SimpleDateFormat("MMMM d");
        Date articleDate = articleDateFormat.parse(givenDate);
        cal.setTime(articleDate);
        cal.add(Calendar.YEAR, -50);
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yy");
        return df.format(cal.getTime());
    }

    public static String getDateValueXDaysFromAnyDate2(String givenDate, int count) throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat articleDateFormat = new SimpleDateFormat("MMMM d");
        Date articleDate = articleDateFormat.parse(givenDate);
        cal.setTime(articleDate);
        cal.add(Calendar.DATE, count);
        SimpleDateFormat df = new SimpleDateFormat("d");
        return df.format(cal.getTime());
    }

    public static String yesterdayTodayTomorrow(String givenDay) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("d");

        if (givenDay.equalsIgnoreCase("today")) {
            cal.add(Calendar.DATE, 0);

        } else if (givenDay.equalsIgnoreCase("tomorrow")) {
            cal.add(Calendar.DATE, 1);

        } else if (givenDay.equalsIgnoreCase("yesterday")) {
            cal.add(Calendar.DATE, -1);
        }
        return df.format(cal.getTime());
    }
}
