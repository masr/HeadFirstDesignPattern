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
	//����һ�����ӷ������������ѡ�񸲸�Ҳ����ѡ�񲻸���
	//hook
	boolean customerWantsCondiments(){
		return true;
	}

}
