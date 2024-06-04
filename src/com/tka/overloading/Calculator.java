package com.tka.overloading;

public class Calculator {
	public void add(int num1,int num2) {
		System.out.println("first method :"+(num1+num2));
	}
	public void add(int num1,float num2) {
		System.out.println("second method :"+(num1+num2));
	}
	public void add(float num1,float num2) {
		System.out.println("third method :"+(num1+num2));
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(11, 5);
		calculator.add(11, 5f);
		calculator.add(11f, 5f);
		
		
	}

}
