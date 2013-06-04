package com.maosuhan.designpattern.state;

public class GumballMachine {
	private State state;
	private StateManager stateManager;
	private int count=0;
	public GumballMachine(int numberGumballs){
		stateManager=new StateManager(this);
		state=stateManager.getState(StateType.soldOut);
		this.count=numberGumballs;
		if (count>0)
			state=stateManager.getState(StateType.noQuarter);
	}
public void setState(StateType type){
	this.state=stateManager.getState(type);
}

public void ejectQuarter(){
	state.ejectQuarter();
}
public void insertQuarter(){
	state.insertQuarter();
}

public void turnCrank(){
	state.turnCrank();
	state.dispense();
}




public void releaseBall(){
	System.out.println("A gumball comes rolling out the slot¡­¡­");
	count--;
}

public int getCount() {
	return this.count;
}
}
