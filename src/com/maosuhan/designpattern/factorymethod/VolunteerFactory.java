package com.maosuhan.designpattern.factorymethod;


public class VolunteerFactory implements LeiFengFactory{

	@Override
	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}
   
}
