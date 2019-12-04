import java.text.ParseException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws ParseException
	{
		Scanner keyin=new Scanner(System.in);
		String date=keyin.nextLine();
		UserMainCode.displayDate(date);
		
	}

}
