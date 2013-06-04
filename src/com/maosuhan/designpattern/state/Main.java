package com.maosuhan.designpattern.state;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
   GumballMachine gumballMachine=new GumballMachine(2);
   gumballMachine.insertQuarter();
   gumballMachine.turnCrank();
   
   gumballMachine.insertQuarter();
   gumballMachine.turnCrank();
   gumballMachine.insertQuarter();
   gumballMachine.turnCrank();

	}

}
