package com.maosuhan.designpattern.abstractfactory;

public class CheesePizza extends Pizza{
  
  public CheesePizza(String name,PizzaIngredientFactory ingredientFactory){
	  super(name, ingredientFactory);
  }
  
  
  public void prepare(){
	  System.out.println(name+" preparing¡­¡­ Using factory "+ingredientFactory.getName());
     dough=ingredientFactory.createDough();
     sauce=ingredientFactory.createSauce();
     cheese=ingredientFactory.createCheese();
  }
}
