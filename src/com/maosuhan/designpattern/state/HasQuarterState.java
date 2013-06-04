package com.maosuhan.designpattern.state;

import java.util.Random;

public class HasQuarterState extends State{

   private Random randomWinner= new Random(System.currentTimeMillis());

	public HasQuarterState(GumballMachine machine) {
		super(machine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
		
	}

	@Override
	public void ejectQuarter() {
   System.out.println("Quarter returned");
   machine.setState(StateType.noQuarter);
	}

	@Override
	public void insertQuarter() {
   System.out.println("You can't insert another quarter");		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		int winner=randomWinner.nextInt(10);
		if ((winner==0)&&(machine.getCount()>1)){
			machine.setState(StateType.winner);
		}else{
			machine.setState(StateType.sold);
		}
		
	}

}
