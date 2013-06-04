package com.maosuhan.designpattern.command;

public class Main  {
public static void main(String args[]){
	RemoteControl control=new RemoteControl();
	Light light=new Light();
	LightOnCommand lightOnCommand=new LightOnCommand(light);
	LightOffCommand lightOffCommand=new LightOffCommand(light);
	control.setCommand(0,lightOnCommand,lightOffCommand);
	control.onButtonWasPressed(0);
	control.offButtonWasPressed(0);
	
	
	CeilingFan fan=new CeilingFan();
	Command ceilingFanHighCommand=new CeilingFanHighCommand(fan);
	Command ceilingFanMediumCommand=new CeilingFanMediumCommand(fan);
	Command ceilingFanLowCommand=new CeilingFanLowCommand(fan);
	Command ceilingFanOffCommand=new CeilingFanOffCommand(fan);
	control.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
	control.setCommand(2, ceilingFanMediumCommand, ceilingFanOffCommand);
	control.setCommand(3, ceilingFanLowCommand, ceilingFanOffCommand);

	control.onButtonWasPressed(2);
	control.onButtonWasPressed(3);
	control.onButtonWasPressed(1);
	control.onButtonWasPressed(3);
	control.undoButtonWasPressed();
	control.undoButtonWasPressed();
	control.undoButtonWasPressed();
	control.undoButtonWasPressed();
	
	Command macroOnCommand=new MacroCommand(new Command[]{lightOnCommand,ceilingFanMediumCommand});
	Command macroOffCommand =new MacroCommand(new Command[]{lightOffCommand,ceilingFanOffCommand});
	control.setCommand(4,macroOnCommand,macroOffCommand);
	control.onButtonWasPressed(4);
	control.offButtonWasPressed(4);
	
	
    System.out.println(control);
}
}
