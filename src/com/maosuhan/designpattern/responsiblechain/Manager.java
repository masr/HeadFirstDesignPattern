package com.maosuhan.designpattern.responsiblechain;


public abstract class Manager {
  protected String name;
  protected Manager superior;
  protected int privilege;
  public void setSuperior(Manager superior)
  {
	  this.superior=superior;
	  
  }
  
  public Manager(int privilege){
	  this.privilege=privilege;
  }
  
  public abstract void requestApplication(Request request);
}
