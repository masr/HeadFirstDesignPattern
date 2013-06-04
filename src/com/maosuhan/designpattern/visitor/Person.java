package com.maosuhan.designpattern.visitor;

public abstract class Person {
	private String name;
	public Person(String name){
		this.name=name;
	}
  public abstract void accept(Action action);
  
  public String getName(){
	  return name;
  }
}
