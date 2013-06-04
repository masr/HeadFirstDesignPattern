package com.maosuhan.designpattern.state;

public class NoQuarterState extends State{





	public NoQuarterState(GumballMachine machine) {
		super(machine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}

	@Override
	public void ejectQuarter() {
    System.out.println("You turned, but there's no quarter");		
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
         machine.setState(StateType.hasQuarter);
	}

	@Override
	public void turnCrank() {
   System.out.println("You turned ,but there's no quarter");		
	}

}
