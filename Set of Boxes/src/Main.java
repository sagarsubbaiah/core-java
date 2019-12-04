import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		Set<Box> box=new HashSet<Box>();
		int n;
		System.out.println("Enter the number of Box");
		n=Integer.parseInt(keyin.nextLine());
		Box[] b=new Box[n]; 
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Box "+(i+1)+" details");
			System.out.println("Enter Length");
			double len=keyin.nextDouble();
			System.out.println("Enter Width");
			double wid=keyin.nextDouble();
			System.out.println("Enter Height");
			double ht=keyin.nextDouble();
			b[i]=new Box(len,wid,ht);
			box.add(b[i]);
			int count=0;
			for(Box a:box)
			{
				if(a.equals(b[i].getLen(),b[i].getWid(),b[i].getHeight()))
				{
					count++;
					if(count==2)
					{
						box.remove(a);
						break;
						
					}
				}
			}
		}
		//TreeSet<Box> ts=new TreeSet<Box>();
		//ts.addAll(box);
		
				
		TreeMap<Double,Box> tm=new TreeMap<Double,Box>();
		
		System.out.println("Unique Boxes in the Set are");
		for(Box obj:box)
		{
			tm.put(obj.getHeight()*obj.getLen()*obj.getWid(),obj);		}
		for(Double a:tm.keySet())
		{
			System.out.print("Length ="+tm.get(a).getLen()+" Width ="+tm.get(a).getWid()+" Height ="+tm.get(a).getHeight());
			System.out.printf(" Volume =%.2f\n",a);
		}
	}

}
