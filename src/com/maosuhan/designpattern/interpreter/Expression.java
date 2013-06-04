package com.maosuhan.designpattern.interpreter;

public abstract class Expression {
public void interpret(GameContext context){
	String text=context.getPlayContext();
	if (text.length()==0)
	{
		return ;
	}
	else {
		String playKey=text.substring(0,1);
		
	}
}
}
