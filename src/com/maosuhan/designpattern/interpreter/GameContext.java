package com.maosuhan.designpattern.interpreter;

public abstract class GameContext {
private String text="";
public GameContext(String text){
	if (text==null)
		text="";
	else
     	this.text=text;
}
public String getPlayContext(){
	return text;
}
}
