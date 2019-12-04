
 abstract class Card {
	 protected String holderName;
	 protected String cardNumber;
	 protected String expiryDate; 
	 Card(String holderName,String cardNumber,String expiryDate)
	 {
		 this.holderName=holderName;
		 this.cardNumber=cardNumber;
		 this.expiryDate=expiryDate;
	 }
	 void setHold(String holderName)
	 {
		 this.holderName=holderName;
	 }
	 void setCard(String cardNumber)
	 {
		 this.cardNumber=cardNumber;
	 }
	 void setExpiry(String expiryDate)
	 {
		 this.expiryDate=expiryDate;
	 }
	 String getHold()
	 {
		 return holderName;
	 }
	 String getCard()
	 {
		 return cardNumber;
	 }
	 String getExpiry()
	 {
		 return expiryDate;
	 }

}
