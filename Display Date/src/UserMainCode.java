import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class UserMainCode {
	public static void displayDate(String d) throws ParseException
	{
		//Date date=new Date.valueOf(d);
		/*SimpleDateFormat s=new SimpleDateFormat("MMM dd, yyyy");
		Date d1=s.parse(d);
		System.out.println(d1);*/
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(d, formatter);
		System.out.println(date);
	}
}
//May 1, 2016