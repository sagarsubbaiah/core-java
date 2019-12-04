import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		float x,y;
		float z;
		System.out.println("Enter the number of dozens of toys purchased");
		x=keyin.nextFloat();
		System.out.println("Enter the price per dozen");
		y=keyin.nextFloat();
		System.out.println("Enter the selling price of 1 toy");
		z=keyin.nextFloat();
		float a,b,c;
		a=y/12;
		b=z-a;
		c=(b/a)*100;
		System.out.printf("Sam's profit percentage is %.2f percent",c);
		
		
	}

}
