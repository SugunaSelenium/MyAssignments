package week3.day1;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b);
	}
	
	public void multiple(double a, double b) {
		System.out.println(a*b);
	}
	
	public void multiple(int a, double b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(2, 7);
		cal.add(24, 34, 32);
		cal.multiple(24, 5);
		cal.multiple(2, 32);
	}
}
