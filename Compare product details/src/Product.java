
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
	public boolean equals(Object a)
	{
		if(this==a)
		{
			return true;
		}
		if(!(a instanceof Product))
		{
			
			return false;
		}
		
		Product pro=(Product)a;
		return(Long.compare(pro.id,this.id)==0 && pro.productName.equals(this.productName)==true && pro.supplierName.equals(this.supplierName)==true);
		
	}

}
