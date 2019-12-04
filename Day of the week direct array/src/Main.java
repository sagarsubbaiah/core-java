import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		String[] week={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		int n;
		System.out.println("Enter the day number");
		n=keyin.nextInt();
		System.out.println("Day of the week is "+week[n-1]);
		
	}

}
