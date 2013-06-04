package com.maosuhan.designpattern.state;

public abstract class State {
	protected GumballMachine machine;
	public State(GumballMachine machine){
		this.machine=machine;
	}
public abstract void insertQuarter();
public abstract void ejectQuarter();
public abstract void turnCrank();
public abstract void dispense();





}
