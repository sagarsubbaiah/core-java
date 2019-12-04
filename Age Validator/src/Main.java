import java.util.Scanner;
public class Main {
	static void validate(int age)throws InvalidAgeRangeException
	{
		if(age<19)
			throw new InvalidAgeRangeException("");
		//else
			//System.out.println("");
	}
	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int age;
		String name;
		System.out.println("Enter the player name");
		name=keyin.nextLine();
		System.out.println("Enter the player age");
		age=keyin.nextInt();
		try
		{
			validate(age);
			System.out.println("Player name : "+name);
			System.out.println("Player age : "+age);
		}
		catch(Exception m)
		{
			System.out.println("CustomException: InvalidAgeRangeException");
			
		}
		
	}

}
