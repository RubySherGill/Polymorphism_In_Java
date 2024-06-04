package com.tka.overriding;

public class Herbivores extends Animal{
	@Override
	public void eating() {
		System.out.println("eating grass");
	}

}
