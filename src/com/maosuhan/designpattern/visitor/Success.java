package com.maosuhan.designpattern.visitor;

public class Success extends Action{

	@Override
	public void getManConclusion(Man man) {
 System.out.println(man.getName()+"�ɹ�ʱ���������һ��ΰ���Ů�ˡ�");		
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		 System.out.println(woman.getName()+"�ɹ�ʱ���������һ�����ɹ������ˡ�");		
		
	}

}
