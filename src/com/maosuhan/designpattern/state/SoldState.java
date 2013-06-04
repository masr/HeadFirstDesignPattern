package com.maosuhan.designpattern.state;

public class SoldState extends State{


	public SoldState(GumballMachine machine) {
		super(machine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dispense() {
		machine.releaseBall();
		if (machine.getCount()>0){
	machine.setState(StateType.noQuarter);
		}else{
			System.out.println("Oops, out of gumballs!");
			machine.setState(StateType.soldOut);
		}
	}

	@Override
	public void ejectQuarter() {
  System.out.println("Sorry, you already turned the crank");		
	}

	@Override
	public void insertQuarter() {
   System.out.println("Please wait,we are giving you a gumball");		
	}

	@Override
	public void turnCrank() {
   System.out.println("Turning twice doesn't get you another gumballs");		
	}

}
