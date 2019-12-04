import java.util.Scanner;
public class Main {
	public static float calculateProfit(int dozenCount, int pricePerDozen,  int sellPrice)
	{
		float a,b,c;
		a=((float)pricePerDozen)/12;
		b=((float)sellPrice)-a;
		c=(b/a)*100;
		return c;
	}
	
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int x,y;
		int z;
		System.out.println("Enter the number of dozens of toys purchased");
		x=keyin.nextInt();
		System.out.println("Enter the price per dozen");
		y=keyin.nextInt();
		System.out.println("Enter the selling price of 1 toy");
		z=keyin.nextInt();
		float a;
		a=calculateProfit(x,y,z);
		System.out.printf("Sam's profit percentage is %.2f percent",a);
		
		
	}

}
