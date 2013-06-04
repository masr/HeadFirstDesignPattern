package com.maosuhan.designpattern.mediator;

public class Iraq extends Country{

	public Iraq(UnitedNations mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void receiveMessage(String message) {
		 System.out.println("������ �յ�����Ϣ�� "+message);	
		
	}

	@Override
	public void claim(String message) {
   System.out.println("Irap����������"+message);
		mediator.declare(message, this);		
	}

}
