package com.maosuhan.designpattern.command;

public class CeilingFan {
public static final int HIGH=3;
public static final int MEDIUM=2;
public static final int LOW=1;
public static final int OFF=0;
int speed;

public CeilingFan(){
	speed=OFF;
	
}
public void high(){
	System.out.println("���������Ǹ�");
	speed=HIGH;
}

public void medium(){
	System.out.println("�����������е�");

	speed=MEDIUM;
}

public void low(){
	System.out.println("���������ǵ�");

	speed=LOW;
}

public void off(){
	System.out.println("���ȹ���");

	speed=OFF;
}

public int getSpeed(){
	return speed;
}
}






