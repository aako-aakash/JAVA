package com.aako;

class Automobile{
	void car() {
		//super.car();
		System.out.println("BMW");
	}
}

class Moter extends Automobile{
	void car() {
		super.car();
		System.out.println("G-Wagon ");
	}
}



public class SuperDemo {

	public static void main(String[] args) {
		Moter moter1=new Moter();
		moter1.car();
		Automobile auto1=new Automobile();
		auto1.car();
		
	}

}
