package org.test;

public class A {
public A() {
	this("JAVA");
	
}
public A(int id) {
	this(345.34f);
	System.out.println(id);
}
public A(String name) {
	this(12);
	System.out.println(name);
}
public A(float sal) {
	System.out.println(sal);
}
public static void main(String[]args) {
	new A();
}
}
