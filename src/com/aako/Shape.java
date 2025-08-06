//#Q.5)

package com.aako;

public interface Shape {
	abstract void draw();
}

class Circle implements Shape{
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

 class Display{
	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.draw();
	}
}
