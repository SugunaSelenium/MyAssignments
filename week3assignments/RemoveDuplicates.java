package week3assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String sentence = "Hot Summer";
		
		char[] words = sentence.toCharArray();
		
		Set<Character> charset = new LinkedHashSet<Character>();
		
		Set<Character> charset2 = new LinkedHashSet<Character>();
		
		for(char c:words)
		{
			boolean flag = charset.add(c);
			if(!flag)
			{
				charset2.add(c);
			}
			
		}
		
		System.out.println("Unique Characters are : " + charset);
		System.out.println("Duplicate Characters are : "+ charset2);
		
		
		charset.removeAll(charset2);
		System.out.println("after removing duplicate characters : " + charset);
		
		Set<Character> newcharset = new LinkedHashSet<Character>();
		
		for(char c:charset) {
			
			if(c != ' ')
			{
				newcharset.add(c);
			}
					}
		System.out.println(newcharset);
		
		
	}


}


