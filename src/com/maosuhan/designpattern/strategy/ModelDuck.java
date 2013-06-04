package com.maosuhan.designpattern.strategy;


public class ModelDuck extends Duck{

	public ModelDuck(){
		flyBehaviour=new FlyNoWay();
		quakeBehaviour=new Quack();
	}
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
