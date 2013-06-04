package com.maosuhan.designpattern.state;

import java.util.HashMap;


public class StateManager {
	private HashMap<StateType, State> stateMaps;
	public StateManager(GumballMachine machine){
		stateMaps=new HashMap<StateType, State>();
		stateMaps.put(StateType.noQuarter, new NoQuarterState(machine));
		stateMaps.put(StateType.hasQuarter, new HasQuarterState(machine));
		stateMaps.put(StateType.sold, new SoldState(machine));
		stateMaps.put(StateType.soldOut, new SoldOutState(machine));
		stateMaps.put(StateType.winner, new WinnerState(machine));
	}
public State getState(StateType type){
	return stateMaps.get(type);
}
}
