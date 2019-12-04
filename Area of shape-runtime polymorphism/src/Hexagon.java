
class Hexagon extends Shape {
	int side;
	Hexagon(int side)
	{
		super("Hexagon");
		this.side=side;
	}
	void setSide(int side)
	{
		this.side=side;
	}
	int getSide()
	{
		return side;
	}

}
