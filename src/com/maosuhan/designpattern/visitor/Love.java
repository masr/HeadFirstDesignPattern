package com.maosuhan.designpattern.visitor;

public class Love extends Action{

	@Override
	public void getManConclusion(Man man) {
 System.out.println(man.getName()+"����ʱ�����²���ҲҪװ����");		
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		 System.out.println(woman.getName()+"����ʱ�����¶�Ҳװ��������");		
		
	}

}
