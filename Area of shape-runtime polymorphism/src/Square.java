
 class Square extends Shape {
	 int side;
	 double calculateArea()
	 {
		return ((double)side)*((double)side); 
	 }
	 Square(int side)
	 {
		 super("Square");
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
