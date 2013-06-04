package com.maosuhan.designpattern.responsiblechain;

public class Majordomo extends Manager{

	public Majordomo(int privilege) {
		super(privilege);
	}

	@Override
	public void requestApplication(Request request) {
		if (dealCondition(request))
		{
			request.approve();
		}else{
			superior.requestApplication(request);
		}
	}
	
	private boolean dealCondition(Request request){
		return (request.getPrivilege()<=privilege&& request.getType()<=RequestType.REST);
	}

}
