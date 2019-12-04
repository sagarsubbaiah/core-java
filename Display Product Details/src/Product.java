
public class Product {
	private long id;
	private String productName;
	private String supplierName;
	public Product(long id,String productName,String supplierName)
	{
		this.id=id;
		this.productName=productName;
		this.supplierName=supplierName;
	}
	void setId(long id)
	{
		this.id=id;
	}
	void setProduct(String productName)
	{
		this.productName=productName;
	}
	void setSupplier(String supplierName)
	{
		this.supplierName=supplierName;
	}
	long getId()
	{
		return id;
	}
	String getProduct()
	{
		return productName;
	}
	String getSupplier()
	{
		return supplierName;
	}
	String toString(long id,String productName,String supplierName)
	{
		String ids=Long.toString(id);
		String fin=ids+" : "+productName+" : "+supplierName;
		return fin;
	}

}
