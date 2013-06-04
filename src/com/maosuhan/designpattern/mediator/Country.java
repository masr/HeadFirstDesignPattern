package com.maosuhan.designpattern.mediator;

public abstract class Country {
  protected UnitedNations mediator;
  public Country(UnitedNations mediator){
	  this.mediator=mediator;
  }
  
  public abstract  void claim(String message);
  
  public abstract void receiveMessage(String message);
 
}
