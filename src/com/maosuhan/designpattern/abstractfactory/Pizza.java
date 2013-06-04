package com.maosuhan.designpattern.abstractfactory;

import com.maosuhan.designpattern.abstractfactory.ingredient.Cheese;
import com.maosuhan.designpattern.abstractfactory.ingredient.Clam;
import com.maosuhan.designpattern.abstractfactory.ingredient.Dough;
import com.maosuhan.designpattern.abstractfactory.ingredient.Pepper;
import com.maosuhan.designpattern.abstractfactory.ingredient.Sauce;

public abstract class Pizza {
  protected String name;
  protected Dough dough;
  protected Sauce sauce;
  protected Cheese cheese;
  protected Clam clam;
  protected Pepper pepper;
  protected PizzaIngredientFactory ingredientFactory;
  
  public Pizza(String name,PizzaIngredientFactory ingredientFactory){
	  this.name=name;
	  this.ingredientFactory=ingredientFactory;
  }
  abstract void prepare();
  
  public void bake(){
	  System.out.println("Baking¡­¡­");
  }
  public void cut(){
	  System.out.println("Cutting¡­¡­");
  }
  public void box(){
	  System.out.println("Boxing¡­¡­");
  }
  

  public String getName(){
	  return name;
  }
}
