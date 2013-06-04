package com.maosuhan.designpattern.visitor;

public class Success extends Action{

	@Override
	public void getManConclusion(Man man) {
 System.out.println(man.getName()+"成功时，身后多半有一个伟大的女人。");		
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		 System.out.println(woman.getName()+"成功时，身后多半有一个不成功的男人。");		
		
	}

}
