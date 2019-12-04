import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the 2 numbers");
		a=keyin.nextInt();
		b=keyin.nextInt();
		try
		{
			int qu=a/b;
			System.out.println("The quotient of "+a+"/"+b+" = "+qu);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("DivideByZeroException caught");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}

}
