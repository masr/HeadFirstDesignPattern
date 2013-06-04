package com.maosuhan.designpattern.command;

import java.util.Stack;

public class CeilingFanUndoer {
	private Stack<Integer> speeds;
	private CeilingFan fan;
	public CeilingFanUndoer(CeilingFan fan){
		this.fan=fan;
		speeds=new Stack<Integer>();
	}
public void undo(){
	int prevSpeed=speeds.pop();
	switch (prevSpeed){
	case CeilingFan.MEDIUM:
		fan.medium();break;
	case CeilingFan.LOW:
		fan.low();break;
	case CeilingFan.OFF:
		fan.off();break;
	case CeilingFan.HIGH:
		fan.high();break;
	}
}



public void setPrevSpeed(int speed){
	speeds.push(speed);
}
}
