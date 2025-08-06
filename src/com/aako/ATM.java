package com.aako;

 interface ATM {
	abstract void checkBalance();
}

class ATM_func implements ATM{
	public void checkBalance() {
		System.out.println("Check Balance Code!");
	}
}


class ATM_SBI{
	public static void main(String [] args) {
		ATM_func atm1=new ATM_func();
		atm1.checkBalance();
	}
}

