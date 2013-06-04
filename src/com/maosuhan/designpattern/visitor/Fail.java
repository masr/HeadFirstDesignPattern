package com.maosuhan.designpattern.visitor;

public class Fail extends Action{

	@Override
	public void getManConclusion(Man man) {
 System.out.println(man.getName()+"ʧ��ʱ����ͷ�Ⱦƣ�˭Ҳ����Ȱ��");		
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		 System.out.println(woman.getName()+"ʧ��ʱ��˭ҲȰ���ˡ�");		
		
	}

}
