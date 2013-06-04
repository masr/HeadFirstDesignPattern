package com.maosuhan.designpattern.mediator;

public class UnitedNationsSecurityCouncil extends UnitedNations{
	private Country[] countries;
	

	
	public void setCountries(Country[] countries){
		this.countries=countries;

	}

	@Override
	public void declare(String message, Country country) {
        for(Country c:countries)
        {
        	if (c!=country)
        		c.receiveMessage(message);
        }
	}

}
