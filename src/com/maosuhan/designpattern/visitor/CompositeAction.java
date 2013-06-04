package com.maosuhan.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;


public class CompositeAction extends Action{
   private List<Action> actions;
   
   public CompositeAction(){
        actions=new ArrayList<Action>();
	   
   }
   
   public void addAction(Action action){
	   actions.add(action);
   }

@Override
public void getManConclusion(Man man) {
    	for(Action action:actions)
    		action.getManConclusion(man);
}

@Override
public void getWomanConclusion(Woman woman) {
	for(Action action:actions)
		action.getWomanConclusion(woman);
}
   
   
}
