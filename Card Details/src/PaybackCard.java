
 class PaybackCard extends Card {
	 private int pointsEarned;
	 private double totalAmount;
	 PaybackCard(String holderName,String cardNumber,String expiryDate,int pointsEarned, double totalAmount)
	 {
		 super(holderName,cardNumber,expiryDate);
		 this.pointsEarned=pointsEarned;
		 this.totalAmount=totalAmount;
	 }
	 void setPoints(int pointsEarned)
	 {
		 this.pointsEarned=pointsEarned;
	 }
	 void setTotal(double totalAmount)
	 {
		 this.totalAmount=totalAmount;
	 }
	 int getPoints()
	 {
		 return pointsEarned;
	 }
	 double getTotal()
	 {
		 return totalAmount;
	 }

}
