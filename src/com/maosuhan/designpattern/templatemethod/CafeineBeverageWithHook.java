package com.maosuhan.designpattern.templatemethod;

public abstract class CafeineBeverageWithHook {
	
	 final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
	
	abstract void brew();
	abstract void addCondiments();
	void boilWater(){
		System.out.println("Boiling water");
	}
	void pourInCup(){
		System.out.println("Pouring into cup");
	}
	//这是一个钩子方法。子类可以选择覆盖也可以选择不覆盖
	//hook
	boolean customerWantsCondiments(){
		return true;
	}

}
