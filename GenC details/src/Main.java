import java.util.Scanner;
class Student
{
	private long id;
	private String name;
	public Student()
	{
		id=0l;
		name=" ";
		
	}
	void setId(long id)
	{
		this.id=id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	public long getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	private static final String COHORT_CODE="CHNAJ19004";
	public void display()
	{
		System.out.println(id+" "+name+" "+COHORT_CODE);
	}
}
public class Main {
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of GenCs");
		n=keyin.nextInt();
		Student[] obj;
		obj=new Student[n];
		for(int i=0;i<n;i++)
		{
			String a;
			String name;
			//long id;
			obj[i]=new Student();
			System.out.println("Enter Employee Id");
			//a=keyin.nextLine();
			long id = Long.parseLong(keyin.nextLine());
			obj[i].setId(id);
			System.out.println("Enter Name");
			//name=keyin.nextLine();
			//obj[i].setId(keyin.nextLong());
			obj[i].setName(keyin.nextLine());
			
		}
		for(int j=0;j<n;j++)
		{
			obj[j].display();
		}
		
	}
	

}
