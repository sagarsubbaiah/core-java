
 class Circle extends Shape {
	 int radius;
	 double calculateArea()
	 {
		 return ((double)radius)*((double)radius)*Math.PI;
	 }
	 
	 Circle(int radius)
	 {
		 super("Circle");
		 this.radius=radius;
		 
	 }
	 void setRad(int radius)
	 {
		 this.radius=radius;
	 }
	 int getRad()
	 {
		 return radius;
	 }

}
