import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int a[] = new int[10];
		for(int i=0;i<10;i++) {
			a[i]=keyin.nextInt();
		}
		int n=a.length;
		System.out.println(a[6]);
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println();
		for(int i:a) {
			System.out.println(i);
		}
	}

}
