import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		long salary = keyin.nextLong();
		TaxSlab a = new TaxSlab(0,300000,0);
		TaxSlab b = new TaxSlab(300001,500000,5);
		TaxSlab c = new TaxSlab(500001,1000000,20);
		TaxSlab d = new TaxSlab(0,300000,0);
		float tax= (float) (a.calculateSlabTax(salary)+b.calculateSlabTax(salary)+c.calculateSlabTax(salary)+d.calculateSlabTax(salary));
		/*if(salary<=300000) {
			tax=0;
		}
		else if(salary>300000 && salary<=500000) {
			tax= (float) (0.05*salary);
		}
		else if(salary>500000 && salary<=100000) {
			tax=(float) ((0.05*250000)+(salary-500000)*0.2);
		}
		else if(salary>1000000) {
			tax=(float) ((0.05*250000)+(0.2*500000)+(salary-1000000)*0.3);
			
		}*/
		
		System.out.println(tax);
	}

}
