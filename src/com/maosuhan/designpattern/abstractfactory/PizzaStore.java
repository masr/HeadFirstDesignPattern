package com.maosuhan.designpattern.abstractfactory;

public  class PizzaStore {
	private PizzaIngredientFactory ingredientFactory;
	
	private Pizza createPizza(PizzaType type) {
		Pizza pizza=null;
		switch(type){
		case cheese:
			pizza=new CheesePizza("Cheese Pizza",ingredientFactory);
			break;
		case clam :
			pizza=new ClamPizza("Clam Pizza",ingredientFactory);
			break;
		case pepper:
			pizza=new PepperPizza("PepperPizza",ingredientFactory);
			break;
		}
		pizza.prepare();
		return pizza;
	}
	
  public PizzaStore(PizzaIngredientFactory ingredientFactory){
	  this.ingredientFactory=ingredientFactory;
  }
  
  public void orderPizza(PizzaType type){
	  Pizza pizza=createPizza(type);
	  pizza.bake();
	  pizza.cut();
	  pizza.box();
	  System.out.println(pizza.getName()+" is OK!");
  }
}
