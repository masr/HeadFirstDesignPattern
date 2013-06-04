package com.maosuhan.designpattern.strategy;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck modelDuck=new ModelDuck();
		modelDuck.performQuack();
		modelDuck.performFly();
		modelDuck.display();
		modelDuck.setFlyBehaviour(new FlyRocketPowered());
		modelDuck.performFly();
	}

}
