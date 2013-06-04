package com.maosuhan.designpattern.templatemethod;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    CafeineBeverageWithHook coffeeWithHook=new CoffeeWithHook();
    
    System.out.println("\nMaking Coffee¡­¡­");
    coffeeWithHook.prepareRecipe();
    
      
	}

}
