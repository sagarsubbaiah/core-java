import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int n,sum=0,sum1=0;
		//float avg;
		n=keyin.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			al.add(keyin.nextInt());
		}
		for(Integer obj:al)
		{
			sum=sum+(Integer)obj;
		}
		System.out.println(sum);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			sum1=sum1+it.next();
		}
		float avg=((float)sum1)/n;
		System.out.printf("%.2f",avg);
	}

}
