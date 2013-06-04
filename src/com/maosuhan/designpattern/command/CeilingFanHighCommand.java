package com.maosuhan.designpattern.command;

public class CeilingFanHighCommand implements Command{
CeilingFan ceilingFan;
CeilingFanUndoer undoer;

public CeilingFanHighCommand(CeilingFan ceilingFan){
	this.ceilingFan=ceilingFan;
	undoer=new CeilingFanUndoer(ceilingFan);
}

public void execute(){
	undoer.setPrevSpeed(ceilingFan.getSpeed());
	ceilingFan.high();
}

public void undo(){
undoer.undo();
}
}
