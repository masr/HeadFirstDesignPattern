package com.maosuhan.designpattern.command;

import java.util.Stack;

public class RemoteControl {
Command[] onCommands;
Command[] offCommands;
Stack<Command> undoCommands;

public RemoteControl(){
	onCommands=new Command[7];
	offCommands=new Command[7];
	Command noCommand=new NoCommand();
	undoCommands=new Stack<Command>();
	for(int i=0;i<7;i++)
	{
		onCommands[i]=noCommand;
		offCommands[i]=noCommand;
	}
}

public void setCommand(int slot,Command onCommand,Command offCommand){
	onCommands[slot]=onCommand;
	offCommands[slot]=offCommand;
}

public void onButtonWasPressed(int slot)
{
	System.out.println("按下了第"+slot+"个开键");
	onCommands[slot].execute();
	undoCommands.push(onCommands[slot]);
}

public void offButtonWasPressed(int slot){
	System.out.println("按下了第"+slot+"个关键");
	offCommands[slot].execute();
	undoCommands.push(offCommands[slot]);
}

public void undoButtonWasPressed(){
	System.out.println("按下了撤销键");
	Command command=undoCommands.pop();
	command.undo();
}

public String toString(){
	StringBuffer stringBuffer=new StringBuffer();
	stringBuffer.append("\n-------Remote Control ------------\n");
	for(int i=0;i<onCommands.length;i++){
		stringBuffer.append("[slot "+i+"]"+onCommands[i].getClass().getName()
				+"      "+offCommands[i].getClass().getName()+"\n");
	}
	return stringBuffer.toString();

}
}



























