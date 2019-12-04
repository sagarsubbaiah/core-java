import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)
	{
		Scanner keyin = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first number");
		a=keyin.nextInt();
		System.out.println("Enter the second number");
		b=keyin.nextInt();
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else if(a<b)
		{
			System.out.println(a+" is less than "+b);
		}
		else
		{
			System.out.println(a+" is equal to "+b);
		}
	}
	
	

}
