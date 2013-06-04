package com.maosuhan.designpattern.command;

public class CeilingFanOffCommand implements Command{
CeilingFan ceilingFan;
CeilingFanUndoer undoer;

public CeilingFanOffCommand(CeilingFan ceilingFan){
	this.ceilingFan=ceilingFan;
	undoer=new CeilingFanUndoer(ceilingFan);

}

public void execute(){
	undoer.setPrevSpeed(ceilingFan.getSpeed());
	ceilingFan.off();
}

public void undo(){
undoer.undo();
}
}
