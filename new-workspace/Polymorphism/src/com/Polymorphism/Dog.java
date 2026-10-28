package com.Polymorphism;

public class Dog extends Animalsound {
	public void Sound() {

		System.out.println("Dog says : bow bow bow  ");

	}

	public void Sound(String angry) {

		System.out.println("Dog says : growl growl  ");
		super.sound();

	}

}
