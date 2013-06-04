package com.maosuhan.designpattern.mediator;


public class USA extends Country{
public USA(UnitedNations mediator){
	super(mediator);
}

public void claim(String message){
	System.out.println("USA ������������"+message);
	mediator.declare(message, this);
}

@Override
public void receiveMessage(String message) {
 System.out.println("USA �յ�����Ϣ�� "+message);	
}


}
