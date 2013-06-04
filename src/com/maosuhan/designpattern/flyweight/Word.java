package com.maosuhan.designpattern.flyweight;


public class Word extends Char{
 
	private char c;
	private Color color;
	
	public Word(char c ,Color color){
		this.c=c;
		this.color=color;
	}
	@Override
	public void print(int row, int column) {
       System.out.println("�ڵ�"+row+"�е�"+column+"�д�ӡ����"+c+",��ɫΪ"+color.name()+",�ڴ��ַΪ"+this.toString());
	}

}
