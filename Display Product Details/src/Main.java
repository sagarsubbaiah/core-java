import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		long id;
		String productName,supplierName;
		System.out.println("Enter the product id");
		id=Long.parseLong(keyin.nextLine());
		System.out.println("Enter the product name");
		productName=keyin.nextLine();
		System.out.println("Enter the supplier name");
		supplierName=keyin.nextLine();
		Product p=new Product(id,productName,supplierName);
		//class c=getClass();
		System.out.println(p.toString(id,productName,supplierName));
		System.out.println("Invoking getClass() method : "+p.getClass());
	}

}
