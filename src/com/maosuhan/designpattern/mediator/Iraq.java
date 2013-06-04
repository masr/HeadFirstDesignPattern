package com.maosuhan.designpattern.mediator;

public class Iraq extends Country{

	public Iraq(UnitedNations mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void receiveMessage(String message) {
		 System.out.println("伊拉克 收到了信息： "+message);	
		
	}

	@Override
	public void claim(String message) {
   System.out.println("Irap发表声明："+message);
		mediator.declare(message, this);		
	}

}
