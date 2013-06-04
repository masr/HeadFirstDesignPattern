package com.maosuhan.designpattern.visitor;

public class Love extends Action{

	@Override
	public void getManConclusion(Man man) {
 System.out.println(man.getName()+"恋爱时，凡事不懂也要装懂。");		
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		 System.out.println(woman.getName()+"恋爱时，遇事懂也装作不懂。");		
		
	}

}
