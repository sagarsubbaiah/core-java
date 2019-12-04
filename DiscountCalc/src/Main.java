import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)
	{
		Scanner keyin = new Scanner(System.in);
		float item1,item2;
		int disc;
		System.out.println("Price of item 1 :");
		item1 = keyin.nextFloat();
		System.out.println("Price of item 2 :");
		item2 = keyin.nextFloat();
		System.out.println("Discount in percentage :");
		disc = keyin.nextInt();
		float total,damt,amtd;
		total=item1+item2;
		damt=(100-disc)*total/100;
		amtd=disc*total/100;
		System.out.printf("Total amount : $%.2f\n",total);
		System.out.printf("Discounted amount : $%.2f\n",damt);
		System.out.printf("Saved amount : $%.2f",amtd);
	}

}
