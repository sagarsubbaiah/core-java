import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int a;
		a=keyin.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a+" x "+i+" = "+(a*i));
		}
	}

}
