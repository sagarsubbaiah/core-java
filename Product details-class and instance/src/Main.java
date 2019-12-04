import java.util.Scanner;
class Product
{
	private Long id;
	private String productName;
	private String supplierName;
	String getProduct()
	{
		return productName;
	}
	String getSupplier()
	{
		return supplierName;
	}
	Long getId()
	{
		return id;
	}
	void setProduct(String productName)
	{
		this.productName=productName;
	}
	void setSupplier(String supplierName)
	{
		this.supplierName=supplierName;
	}
	void setId(Long id)
	{
		this.id=id;
	}
	
}
public class Main {
	
	public static void main(String[] args)
	{
		Product obj=new Product();
		Scanner keyin=new Scanner(System.in);
		String i;
		String productName;
		String supplierName;
		System.out.println("Enter the product id");
		i=keyin.nextLine();
		long id = Long.parseLong(i);
		System.out.println("Enter the product name");
		productName=keyin.nextLine();
		System.out.println("Enter the supplier name");
		supplierName=keyin.nextLine();
		obj.setId(id);
		obj.setProduct(productName);
		obj.setSupplier(supplierName);
		System.out.println("Product Id is "+(obj.getId()));
		System.out.println("Product Name is "+(obj.getProduct()));
		System.out.println("Supplier Name is "+(obj.getSupplier()));
	}

}
