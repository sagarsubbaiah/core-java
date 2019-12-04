import java.util.Scanner;

public class Main {
	float costPrice;
	float sellingPrice;
	float profit;
	
	
	public float getCostPrice() {
		return costPrice;
	}


	public void setCostPrice(float costPrice) {
		this.costPrice = costPrice;
	}


	public float getSellingPrice() {
		return sellingPrice;
	}


	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}


	public float getProfit() {
		return profit;
	}


	public void setProfit(float profit) {
		this.profit = profit;
	}


	public float calculateProfit(int dozenCount,int pricePerDozen,int sellPrice){
		
		costPrice = (float) pricePerDozen/12;
		sellingPrice = sellPrice;
		profit = sellingPrice - costPrice;
		
		
		
		return (profit/costPrice)*100;
	}
	

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of dozens of toys purchased");
		int x = sc.nextInt();
		System.out.println("Enter the price per dozen");
		int y = sc.nextInt();
		System.out.println("Enter the selling price of 1 toy");
		int z = sc.nextInt();

		
		
		System.out.printf("Sam's profit percentage is %.2f percent",new Main().calculateProfit(x,y,z));
	}
}
