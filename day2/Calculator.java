package week1.day2;

public class Calculator {
	public int add(int a, int b, int c) {
		int sum=a+b+c;
		return sum;
	}
	
	public int mul(int d, int e) {
		int result=d*e;
		return result;
	}
	
	public void sub(){
		System.out.println("Nothing to return");
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.add(10, 10, 10));
		System.out.println(cal.mul(5, 10));
		cal.sub();
	}
}

