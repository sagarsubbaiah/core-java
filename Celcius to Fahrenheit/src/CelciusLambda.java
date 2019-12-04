import java.util.Scanner;

public interface CelciusLambda {
	public double toCelciusLamb(double a);
	
	public static void main(String[] args) {
		double b;
		Scanner keyin = new Scanner(System.in);
		b=keyin.nextDouble();
		CelciusLambda obj = (a)->{return ((a -32)*5/9);};
		System.out.println(obj.toCelciusLamb(b));
		
	}

}
