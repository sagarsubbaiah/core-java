import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	int a;
	
	a=keyin.nextInt();
	int n[] = new int[a];
	int flag=0;
	for(int i=0;i<a;i++) {
		n[i]=keyin.nextInt();
		
	}
	int b=n[0];
	for(int i=0;i<a;i++) {
		if(n[i]>flag)
			flag=n[i];
		if(n[i]<b)
			b=n[i];
	}
	System.out.println(flag);
	System.out.println(b);
	}

}
