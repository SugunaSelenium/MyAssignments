package org.bank;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("This is a deposit account");
	}
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.deposit();

	}

}
