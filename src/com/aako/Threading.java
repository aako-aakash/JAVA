package com.aako;

public class Threading  extends Thread{

	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread Running!"+i);
		}
	}
	
	
	
	public static void main(String[] args) {
		Threading t1=new Threading();
		t1.start();

	}

}
