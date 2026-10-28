package com.Inheritance;

public class Washingmachine extends Machine {
	private String ModelType = "Top-load Washingmachine";

	public static void main(String[] args) {

		Washingmachine Washmachine = new Washingmachine();

		Washmachine.wash();
		System.out.println(Washmachine.brand + " - " + Washmachine.ModelType);

	}

}
