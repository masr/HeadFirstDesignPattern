package com.maosuhan.designpattern.abstractfactory;

public class PepperPizza extends Pizza{

	public PepperPizza(String name, PizzaIngredientFactory ingredientFactory) {
		super(name, ingredientFactory);
		// TODO Auto-generated constructor stub
	}

	  public void prepare(){
		  System.out.println(name+" preparing¡­¡­ Using factory "+ingredientFactory.getName());
	     dough=ingredientFactory.createDough();
	     sauce=ingredientFactory.createSauce();
	     pepper=ingredientFactory.createPepper();
	  }

}
