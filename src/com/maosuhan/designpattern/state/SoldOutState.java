package com.maosuhan.designpattern.state;

public class SoldOutState extends State{



	public SoldOutState(GumballMachine machine) {
		super(machine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dispense() {
    System.out.println("No gumballs!");		
	}

	@Override
	public void ejectQuarter() {
	    System.out.println("No gumballs!");		
		
	}

	@Override
	public void insertQuarter() {
	    System.out.println("No gumballs!");		
		
	}

	@Override
	public void turnCrank() {
	    System.out.println("No gumballs!");		
		
	}

}
