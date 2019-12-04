
class Delivery {
	void displayDeliveryDetails(String bowler, String batsman)
	{
		int a,b;
		a=bowler.lastIndexOf(" ");
		System.out.println("Player details of the delivery:");
		System.out.println("Bowler: "+bowler.substring(a+1));
		b=batsman.lastIndexOf(" ");
		System.out.println("Batsman: "+batsman.substring(b+1));
	}
	void displayDeliveryDetails(Long runs)
	{
		System.out.println("Number of runs scored in the delivery : "+runs);
		if(runs==4)
		{
			System.out.println("It is a boundary.");
		}
		if(runs==6)
		{
			System.out.println("It is a Sixer.");
		}
	}

}
