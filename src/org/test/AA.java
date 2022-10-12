package org.test;

public class AA extends B{
	public AA() {
		super(123);
		System.out.println("Default constructor");
		
	}
	public static void main(String[] args) {
		new AA();
	}
	

}
