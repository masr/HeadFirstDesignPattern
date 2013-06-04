package com.maosuhan.designpattern.visitor;

public class Man extends Person{

	public Man(String name) {
		super(name);
	}

	@Override
	public void accept(Action action) {
       action.getManConclusion(this);		
	}

}
