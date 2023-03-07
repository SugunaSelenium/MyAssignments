package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] group= {1,2,3,4,7,6,8};
		Arrays.sort(group);
		for(int i=1;i<group.length;i++) {
			
			if(i!=group[i-1]) {
				System.out.println(i);
				break;
				
			}
		}
		

	}

}
