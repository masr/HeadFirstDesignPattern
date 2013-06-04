package com.maosuhan.designpattern.responsiblechain;

public class GeneralManager extends Manager{

	public GeneralManager(int privilege) {
		super(privilege);
	}

	@Override
	public void requestApplication(Request request) {
		if (dealCondition(request))
		{
			if (request.getContent().length()>10)
			   request.approve();
			else 
				request.deny();
		}else if(superior!=null){
			superior.requestApplication(request);
		}
	}
	
	private boolean dealCondition(Request request){
		return (request.getPrivilege()<=privilege&& request.getType()<=RequestType.PLUSSALARY);
	}

}
