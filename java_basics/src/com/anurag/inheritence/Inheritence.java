package com.anurag.inheritence;

public class Inheritence {
	public static void main(String[] args) {
		A a = new B();
		a.m1();
		System.out.println("The value of g using refrence ::" + a.g);
	}
}

class A {
	int g = 10;
	static {
		System.out.println("In Static of A");
	}
	{
		System.out.println("In Initializer block of A");
	}

	public A() {
		System.out.println("A");
	}

	public void m1() {
		System.out.println("m1 Of A");
	}

}

class B extends A {
	int g = 20;
	static {
		System.out.println("In Static of B");
	}
	{
		System.out.println("In Initializer block of B");
	}

	public B() {
		System.out.println("B");
	}

	public void m1() {
		System.out.println("B of m1");
		System.out.println("Value of G is " + g);
	}
}
