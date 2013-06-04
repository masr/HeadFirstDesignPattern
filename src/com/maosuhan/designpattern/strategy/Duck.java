package com.maosuhan.designpattern.strategy;

public abstract class Duck {
	protected FlyBehaviour flyBehaviour;
	protected QuakeBehaviour quakeBehaviour;
	public void performFly(){
		flyBehaviour.fly();
	}
	public void performQuack(){
		quakeBehaviour.quake();
	}
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour){
		this.flyBehaviour=flyBehaviour;
	}
	
	public void setQuackBehaviour(QuakeBehaviour quakeBehaviour)
	{
		this.quakeBehaviour=quakeBehaviour;
	}
	
	public abstract void display();

}
