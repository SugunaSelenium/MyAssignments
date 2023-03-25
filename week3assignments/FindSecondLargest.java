package week3assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
	
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};

				Set<Integer> dataset=new TreeSet<Integer>();
				
				for(Integer i:data)
				{
					dataset.add(i);
				}
				System.out.println("Non duplicate set :"+ dataset);
				
				List<Integer> newlist=new ArrayList<Integer>(dataset);
				
				int len=newlist.size();
				
				System.out.println("Second largest number is: "+ newlist.get(len-2));
				
	}

}
