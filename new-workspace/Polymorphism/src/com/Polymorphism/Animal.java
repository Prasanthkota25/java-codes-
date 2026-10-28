package com.Polymorphism;

public class Animal {

	public static void main(String[] args) {

		Animalsound Animal = new Animalsound();
		cow Cow = new cow();

		Dog Dog = new Dog();

		Animal.sound();
		Cow.Sound();
		Dog.Sound();
		Dog.Sound("angry");
		
	}

}
