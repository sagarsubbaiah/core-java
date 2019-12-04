import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String date=sc.nextLine();
		sc.close();
		
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d1=LocalDate.parse(date,d);
		System.out.println(d1);
	}
}
