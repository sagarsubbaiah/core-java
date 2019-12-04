import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int n,sum=0,i=0;
		n=keyin.nextInt();
		int[] camp=new int[n];
		while(i<n)
		{
			camp[i]=keyin.nextInt();
			sum=sum+camp[i];
			i++;
		}
		System.out.println(sum);
		
	}

}
