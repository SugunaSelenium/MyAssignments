package week3assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] queue = {7,3,1,6,8,4,6,10,9};

		List<Integer> num= new ArrayList<Integer>();
		
		for(int i=0; i<queue.length;i++)
		{
		num.add(queue[i]);
		}
		
		System.out.println("Initial List " + num);
		
		Set<Integer> sortnum = new TreeSet<Integer>(num);
		
		System.out.println("Sorted List " + sortnum);
		
		int i=1;
		
		for(int r:sortnum)
		{
			if(r!=i)
			{
				System.out.println(i);
				break;
				
			}
			i = i+1;
			
		}
		
	}

	}


