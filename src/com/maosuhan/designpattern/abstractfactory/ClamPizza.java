package com.maosuhan.designpattern.abstractfactory;

public class ClamPizza extends Pizza{

	public ClamPizza(String name, PizzaIngredientFactory ingredientFactory) {
		super(name, ingredientFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	void prepare() {
		  System.out.println(name+" preparing¡­¡­ Using factory "+ingredientFactory.getName());
		     dough=ingredientFactory.createDough();
		     sauce=ingredientFactory.createSauce();
		     clam=ingredientFactory.createClam();		
	}



}
