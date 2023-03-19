package org.bank;

public class BankInfo {
	
	public void savings() {
		System.out.println("This is a savings account");
	}
	
	public void fixed() {
		System.out.println("This is a fixed account");
	}
	
	public void deposit() {
		System.out.println("This is a deposit account");
	}

	public static void main(String[] args) {
		BankInfo bank=new BankInfo();
		bank.savings();
		bank.fixed();
		bank.deposit();

	}

}
