package com.maosuhan.designpattern.memento;

public class RoleMemento {
  private int vit;
  private int atk;
  private int def;
  
  public RoleMemento(int vit,int atk,int def){
	  this.vit=vit;
	  this.atk=atk;
	  this.def=def;
  }

public int getVit() {
	return vit;
}



public int getAtk() {
	return atk;
}



public int getDef() {
	return def;
}


}
