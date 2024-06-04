package com.tka.overriding;

public class TestAnimal {
	public static void main(String[] args) {
		Herbivores herbivores = new Herbivores();
		herbivores.eating();
		
		Carnivores carnivores = new Carnivores();
		carnivores.eating();
	}

}
