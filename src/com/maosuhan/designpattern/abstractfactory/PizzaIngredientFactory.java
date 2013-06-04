package com.maosuhan.designpattern.abstractfactory;

import com.maosuhan.designpattern.abstractfactory.ingredient.Cheese;
import com.maosuhan.designpattern.abstractfactory.ingredient.Clam;
import com.maosuhan.designpattern.abstractfactory.ingredient.Dough;
import com.maosuhan.designpattern.abstractfactory.ingredient.Pepper;
import com.maosuhan.designpattern.abstractfactory.ingredient.Sauce;

public abstract class PizzaIngredientFactory {

 public abstract Dough createDough();
 public  abstract Sauce createSauce();
 public  abstract Cheese createCheese();
 public  abstract Clam createClam();
 public abstract Pepper createPepper();

 public  abstract String getName();
}
