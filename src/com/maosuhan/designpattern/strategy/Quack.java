package com.maosuhan.designpattern.strategy;

public class Quack implements QuakeBehaviour{

	@Override
	public void quake() {
		System.out.println("Quack");
	}

}
