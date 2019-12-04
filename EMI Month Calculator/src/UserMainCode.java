import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserMainCode {
	public static void displayDate(String d) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//String dateInString = "22-01-2015 10:20:56";
		Date date = sdf.parse(d);
        //DateAndCalendar obj = new DateAndCalendar();
        Calendar calendar = dateToCalendar(date);
        System.out.print("20 months before "+d+" will be ");
        calendar.add(calendar.MONTH,-20);
        Date de=calendar.getTime();
        System.out.print(sdf.format(de));
        
        
        
        
	}
	private  static Calendar dateToCalendar(Date date)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

}
