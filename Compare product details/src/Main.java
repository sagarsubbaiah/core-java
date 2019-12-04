import java.util.Scanner;
public class Main {
	static void display(Product a)
	{
		System.out.println("Product Id is "+a.getId()+"\nProduct Name is "+a.getProduct()+"\nSupplier Name is "+a.getSupplier());
		
	}
	//static boolean equals
	{
		
	}
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		long id1,id2;
		String productName1,productName2,supplierName1,supplierName2;
		System.out.println("Enter the product id");
		id1=Long.parseLong(keyin.nextLine());
		System.out.println("Enter the product name");
		productName1=keyin.nextLine();
		System.out.println("Enter the supplier name");
		supplierName1=keyin.nextLine();
		Product p1=new Product(id1,productName1,supplierName1);
		display(p1);
		System.out.println("Enter the product id");
		id2=Long.parseLong(keyin.nextLine());
		System.out.println("Enter the product name");
		productName2=keyin.nextLine();
		System.out.println("Enter the supplier name");
		supplierName2=keyin.nextLine();
		Product p2=new Product(id2,productName2,supplierName2);
		display(p2);
		if(p2.equals(p1))
			System.out.println("The two products are the same");
		else
			System.out.println("The two products are different");
	}

}
