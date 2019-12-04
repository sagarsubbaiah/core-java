import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int n;
		n=keyin.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			al.add(keyin.nextInt());
		}
		Collections.sort(al);
		for(Integer obj:al)
		{
			System.out.println(obj);
		}
		
	}

}
