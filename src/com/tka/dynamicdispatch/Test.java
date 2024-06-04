package com.tka.dynamicdispatch;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		//a.m2(); //The method m2() is undefined for the type A
		
		B b = new B();
		b.m1();  //b
		b.m2();  //b
		
		A aa = new B();
		aa.m1(); //b
		//aa.m2(); // The method m2() is undefined for the type A
		b.m1(); //b
	}

}
