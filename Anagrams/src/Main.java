import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String s1,s2;
		Scanner keyin = new Scanner(System.in);
		s1=keyin.nextLine();
		s2=keyin.nextLine();
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++) {
			int count=0;
			for(int j=0;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					count++;
					
				}
			}
			hm.put(s1.charAt(i),count);
		}
		Map<Character,Integer> hn = new HashMap<Character,Integer>();
		for(int i=0;i<s2.length();i++) {
			int count=0;
			for(int j=0;j<s2.length();j++) {
				if(s2.charAt(i)==s2.charAt(j)) {
					count++;
					
				}
			}
			hn.put(s2.charAt(i),count);
		}
		int flag=0;
		for(Map.Entry<Character,Integer> en1:hm.entrySet()) {
			Character ch = en1.getKey();
			Integer i1 = en1.getValue();
			if(i1!=hn.get(ch))
			{
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Not ");
		}
		else
			System.out.println("Anagram");

	}

}
