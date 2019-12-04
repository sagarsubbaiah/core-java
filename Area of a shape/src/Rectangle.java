
 class Rectangle extends Shape {
	 int length,breadth;
	 double calculateArea()
	 {
		 return ((double)length)*((double)breadth);
	 }
	 Rectangle(int length,int breadth)
	 {
		 super("Rectangle");
		 this.length=length;
		 this.breadth=breadth;
	 }
	 void setLen(int length)
	 {
		 this.length=length;
	 }
	 void setBre(int breadth)
	 {
		 this.breadth=breadth;
	 }
	 int getLen()
	 {
		 return length;
	 }
	 int getBre()
	 {
		 return breadth;
	 }

}
