import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int n;
		String mkey=null;;
		Long high=0L;
		System.out.println("Enter the number of players");
		n=Integer.parseInt(keyin.nextLine());
		HashMap<String,Long> playerdet=new HashMap();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of the player "+(i+1));
			playerdet.put(keyin.nextLine(),Long.parseLong(keyin.nextLine()));
		}
		for(String a:playerdet.keySet())
		{
			if(playerdet.get(a)>high) {
				high=playerdet.get(a);
				mkey=a;
			}
			
		}
		//Set<HashMap.Entry<String,Long>> set=new playerdet.entrySet();
		//String k=playerdet.getKey()
		System.out.println(mkey);
	}

}
