package com.aako;

public class Threading1 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread Running!"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Threading1 th1=new Threading1();
		th1.start();
		

	}

}
