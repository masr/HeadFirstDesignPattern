package com.maosuhan.designpattern.factorymethod;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LeiFengFactory factory=new VolunteerFactory();
		LeiFeng volunteer=factory.createLeiFeng();
		volunteer.display();
		volunteer.wash();
		volunteer.sweep();
		volunteer.buyRice();
		
	}

}
