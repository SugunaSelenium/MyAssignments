package week3assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
	
		String name = "Happylife";

		char[] ch = name.toLowerCase().toCharArray();

		System.out.println(ch);
 
		Set<Character> namechar = new LinkedHashSet<Character>();

		for(char c: ch) {
			boolean flag = namechar.add(c);
			if(!flag)
			{
				System.out.println("Repeated character is : "+c);
			}
		}

		System.out.println("Unique characters are:  " + namechar);

	}

}


		

