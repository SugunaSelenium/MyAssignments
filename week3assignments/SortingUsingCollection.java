package week3assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] companies= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		
		int len=companies.length;
		
		Arrays.sort(companies);
		
		System.out.println("List of names in descending order :");

		for(int i=len-1; i>=0 ; i--)
		{
			System.out.println(companies[i]);
		}
		
		List<String> newlist = Arrays.asList(companies);
		
		Collections.sort(newlist);
		
		System.out.println("List of names in ascending order :" + newlist);
		
		Collections.reverse(newlist);
		
		System.out.println("Sorting in descending order :" + newlist);
	}
}
		
		


