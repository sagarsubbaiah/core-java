import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int n,sum=0;
		n=keyin.nextInt();
		int[] camp=new int[n];
		for(int i=0;i<n;i++)
		{
			camp[i]=keyin.nextInt();
			sum=sum+camp[i];
		}
		System.out.println(sum);
		
	}

}
