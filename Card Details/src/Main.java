import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int choice;
		String cardDetails;
		System.out.println("Select the Card");
		System.out.println("1.Payback Card");
		System.out.println("2.Membership Card");
		choice=keyin.nextInt();
		keyin.nextLine();
		System.out.println("Enter the Card Details:");
		cardDetails=keyin.nextLine();
		String[] cardSplit = cardDetails.split("\\|");
		
		if(choice==1)
		{
			int points;
			double amount;
			System.out.println("Enter points in card");
			points=keyin.nextInt();
			System.out.println("Enter Amount");
			amount=keyin.nextDouble();
			PaybackCard p=new PaybackCard(cardSplit[0],cardSplit[1],cardSplit[2],points,amount);
			System.out.println(cardSplit[0]+"'s Payback Card Details:");
			System.out.println("Card Number "+cardSplit[1]);
			System.out.println("Points Earned "+p.getPoints());
			System.out.println("Total Amount "+p.getTotal());
		}
		else
		{
			int rating;
			System.out.println("Enter rating in card");
			rating=keyin.nextInt();
			MembershipCard m=new MembershipCard(cardSplit[0],cardSplit[1],cardSplit[2],rating);
			System.out.println(cardSplit[0]+"'s Membership Card Details:");
			System.out.println("Card Number "+cardSplit[1]);
			System.out.println("Rating "+m.getRating());
			
		}
	}

}
