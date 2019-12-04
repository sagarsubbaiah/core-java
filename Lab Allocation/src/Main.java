import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)
	{
		Scanner keyin = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter x");
		x=keyin.nextInt();
		System.out.println("Enter y");
		y=keyin.nextInt();
		System.out.println("Enter z");
		z=keyin.nextInt();
		if(x<y && x<z)
		{
			System.out.println("L1 has the minimal seating capacity");
		}
		else if(y<x && y<z)
		{
			System.out.println("L2 has the minimal seating capacity");
		}
		else
		{
			System.out.println("L3 has the minimal seating capacity");
		}
	}

}
