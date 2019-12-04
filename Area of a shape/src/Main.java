import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int choice;
		System.out.println("1. Rectangle");
		System.out.println("2. Square");
		System.out.println("3. Circle");
		System.out.println("Area Calculator --- Choose your shape");
		choice =keyin.nextInt();
		if(choice==1)
		{
			System.out.println("Enter length and breadth:");
			Rectangle r=new Rectangle(keyin.nextInt(),keyin.nextInt());
			System.out.printf("Area of Rectangle is:%.2f",r.calculateArea());
		}
		else if(choice==2)
		{
			System.out.println("Enter side:");
			Square s=new Square(keyin.nextInt());
			System.out.printf("Area of Square is:%.2f",s.calculateArea());
		}
		else
		{
			System.out.println("Enter Radius:");
			Circle c=new Circle(keyin.nextInt());
			System.out.printf("Area of Circle is:%.2f",c.calculateArea());
		}
	}

}
