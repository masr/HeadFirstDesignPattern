package com.maosuhan.designpattern.mediator;


public class USA extends Country{
public USA(UnitedNations mediator){
	super(mediator);
}

public void claim(String message){
	System.out.println("USA 发表了声明："+message);
	mediator.declare(message, this);
}

@Override
public void receiveMessage(String message) {
 System.out.println("USA 收到了信息： "+message);	
}


}
