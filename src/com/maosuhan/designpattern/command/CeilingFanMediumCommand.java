package com.maosuhan.designpattern.command;

public class CeilingFanMediumCommand implements Command{
CeilingFan ceilingFan;
CeilingFanUndoer undoer;

public CeilingFanMediumCommand(CeilingFan ceilingFan){
	this.ceilingFan=ceilingFan;
	undoer=new CeilingFanUndoer(ceilingFan);

}

public void execute(){
	undoer.setPrevSpeed(ceilingFan.getSpeed());
	ceilingFan.medium();
}

public void undo(){
	undoer.undo();
}
}
