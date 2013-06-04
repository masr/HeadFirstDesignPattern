package com.maosuhan.designpattern.memento;

public class RoleStateCaretaker {
  private RoleMemento memento;

public RoleMemento getMemento() {
	return memento;
}

public void setMemento(RoleMemento memento) {
	this.memento = memento;
}
  
}
