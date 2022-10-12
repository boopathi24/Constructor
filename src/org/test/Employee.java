package org.test;

public class Employee extends Company{
public Employee() {
	this("asd");
	System.out.println("Parent Default constructor");
}

public Employee(String name) {
	super("kat");
	System.out.println("Sring");
}
public static void main(String[] args) {
	new Employee();
}
}
