package com.maosuhan.designpattern.visitor;

public class Woman extends Person{
	public Woman(String name) {
		super(name);
	}

	@Override
	public void accept(Action action) {
       action.getWomanConclusion(this);		
	}

}
