
public class Box {
	double length,width,height;
	public Box(double length,double width,double height)
	{
		this.length=length;
		this.height=height;
		this.width=width;
	}
	void setLen(double length)
	{
		this.length=length;
	}
	void setHeight(double height)
	{
		this.height=height;
	}
	void setWid(double width)
	{
		this.width=width;
	}
	double getLen()
	{
		return length;
	}
	double getHeight()
	{
		return height;
	}
	double getWid()
	{
		return width;
	}
	public boolean equals(double length,double width,double height)
	{
		if((this.height*this.length*this.width)==(length*width*height))
			return true;
		else
			return false;
	}
}
