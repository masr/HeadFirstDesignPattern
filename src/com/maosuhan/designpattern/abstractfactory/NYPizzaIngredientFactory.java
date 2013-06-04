package com.maosuhan.designpattern.abstractfactory;

import com.maosuhan.designpattern.abstractfactory.ingredient.BlackPepper;
import com.maosuhan.designpattern.abstractfactory.ingredient.Cheese;
import com.maosuhan.designpattern.abstractfactory.ingredient.Clam;
import com.maosuhan.designpattern.abstractfactory.ingredient.Dough;
import com.maosuhan.designpattern.abstractfactory.ingredient.FreshClam;
import com.maosuhan.designpattern.abstractfactory.ingredient.MarinaraSauce;
import com.maosuhan.designpattern.abstractfactory.ingredient.Pepper;
import com.maosuhan.designpattern.abstractfactory.ingredient.ReggianoCheese;
import com.maosuhan.designpattern.abstractfactory.ingredient.Sauce;
import com.maosuhan.designpattern.abstractfactory.ingredient.ThinCrustDough;

public class NYPizzaIngredientFactory extends PizzaIngredientFactory{
  


	@Override
	public Cheese createCheese() {
		System.out.println("Creating ReggianoCheese");
	return new ReggianoCheese();
	}

	@Override
	public Clam createClam() {
		System.out.println("Creating FreshClam");
		return new FreshClam();
	}

	@Override
	public Dough createDough() {
		System.out.println("Creating ThinCrustDough");
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		System.out.println("Creating MarinaraSauce");
		return new MarinaraSauce();
	}

	@Override
	public Pepper createPepper() {
		System.out.println("Creating BlackPepper");
		return new BlackPepper();
	}

	@Override
	public String getName() {
		return "NYPizzaFactory";
	}

}
