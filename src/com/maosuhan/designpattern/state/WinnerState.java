package com.maosuhan.designpattern.state;

public class WinnerState extends State{

	public WinnerState(GumballMachine machine) {
		super(machine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dispense() {
		System.out.println("YOU'RE A WINNER! You get two gumballs for quarter");
		machine.releaseBall();
		if (machine.getCount()==0)
			machine.setState(StateType.soldOut);
			else{
              machine.releaseBall();
              if (machine.getCount()>0)
            	  machine.setState(StateType.noQuarter);
              else{
            	  System.out.println("Oops, out of gumballs!");
            	  machine.setState(StateType.soldOut);
              }
			}
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Error");		
	}

	@Override
	public void insertQuarter() {
		System.out.println("Error");	
		
	}

	@Override
	public void turnCrank() {
		 System.out.println("Error");		
		
	}

}
