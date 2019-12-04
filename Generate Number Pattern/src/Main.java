import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int a;
		a=keyin.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	
	}
	

}
