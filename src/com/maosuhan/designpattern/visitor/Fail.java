package com.maosuhan.designpattern.visitor;

public class Fail extends Action{

	@Override
	public void getManConclusion(Man man) {
 System.out.println(man.getName()+"失败时，闷头喝酒，谁也不用劝。");		
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		 System.out.println(woman.getName()+"失败时，谁也劝不了。");		
		
	}

}
