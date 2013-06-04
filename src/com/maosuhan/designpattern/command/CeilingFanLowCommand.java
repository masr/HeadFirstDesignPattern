package com.maosuhan.designpattern.command;

public class CeilingFanLowCommand implements Command{
CeilingFan ceilingFan;
CeilingFanUndoer undoer;

public CeilingFanLowCommand(CeilingFan ceilingFan){
	this.ceilingFan=ceilingFan;
	undoer=new CeilingFanUndoer(ceilingFan);

}

public void execute(){
	undoer.setPrevSpeed(ceilingFan.getSpeed());
	ceilingFan.low();
}

public void undo(){
undoer.undo();
}
}
