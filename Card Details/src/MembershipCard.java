
 class MembershipCard extends Card {
	 private int rating;
	 MembershipCard(String holderName,String cardNumber,String expiryDate,int rating)
	 {
		 super(holderName,cardNumber,expiryDate);
		 this.rating=rating;
	 }
	  void setRating(int rating)
	  {
		  this.rating=rating;
	  }
	  int getRating()
	  {
		  return rating;
	  }

}
