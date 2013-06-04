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
       System.out.println("在第"+row+"行第"+column+"列打印出了"+c+",颜色为"+color.name()+",内存地址为"+this.toString());
	}

}
