package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0;
		int secNum=1;
		int sum=0;
		 for (int i = 1; i <=11; i++) {
			sum=firstNum+secNum;
			System.out.println(sum);
			firstNum=secNum;
			secNum=sum;
		}

	}

}
