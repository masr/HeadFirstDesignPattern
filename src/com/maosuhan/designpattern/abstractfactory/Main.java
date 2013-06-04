package com.maosuhan.designpattern.abstractfactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
  PizzaStore pizzaStore=new PizzaStore(ingredientFactory);
  pizzaStore.orderPizza(PizzaType.clam);
	}

}
