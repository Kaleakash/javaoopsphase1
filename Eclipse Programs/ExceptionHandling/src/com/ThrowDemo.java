package com;

class AccountMinMaintain extends Exception {
	public AccountMinMaintain() {

	}
	public AccountMinMaintain(String msg) {
			super(msg);			// call super class parameterized constructor 
	}
}
public class ThrowDemo {
	public static void main(String[] args) {
		int accno=123;
		String name = "Ravi";
		float amount = 700;
		float balance = amount -250;
		try {
			//int res = 10/0;
			if(balance<500) {
				//throw new Exception();
				//throw new ArithmeticException();
				//throw new ArithmeticException("Maintain min 500 amount in account");
				//throw new AccountMinMaintain();
				throw new AccountMinMaintain("Maintaine min 500 amount in account");
				}else {
					System.out.println("Your balance amount is "+balance);
				}
		
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			System.out.println(e.toString());
		}
		System.out.println("finish");
	}

}
