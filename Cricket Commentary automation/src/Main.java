import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int choice;
		String bo,ba;
		long runs;
		Delivery obj=new Delivery();
		System.out.println("Menu");
		System.out.println("1.Player details of the delivery");
		System.out.println("2.Run details of the delivery");
		choice=keyin.nextInt();
		keyin.nextLine();
		if(choice==1)
		{
			System.out.println("Enter the bowler name");
			bo=keyin.nextLine();
			System.out.println("ENter the batsman name");
			ba=keyin.nextLine();
			obj.displayDeliveryDetails(bo,ba);
		}
		else
		{
			System.out.println("Enter the number of runs");
			runs=keyin.nextLong();
			obj.displayDeliveryDetails(runs);
		}
		
	}

}
