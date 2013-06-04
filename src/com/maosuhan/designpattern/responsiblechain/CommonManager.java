package com.maosuhan.designpattern.responsiblechain;

public class CommonManager extends Manager{

	
	public CommonManager(int privilege) {
		super(privilege);
	}

	@Override
	public void requestApplication(Request request) {
   if (dealCondition(request))
   {
	   request.approve();
   }
      else {
	  superior.requestApplication(request);
    }
          		
	}
	
	private boolean dealCondition(Request request){
		return (request.getPrivilege()<=privilege&& request.getType()<=RequestType.PLAY);
	}

}
