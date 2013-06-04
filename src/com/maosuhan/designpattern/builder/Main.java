package com.maosuhan.designpattern.builder;
 
/**
 * ���ⲿ���ԣ���һ����������Ĺ����Ĺ������������ˣ���ʱ�����ڹ���һ�������Ķ����ʱ�򣬻�newһ��ʵ��
 * �����ٵ���һϵ�еĸö���ķ����������ӱ�¶������Ļ����ܿ���ȥ�Ƚ����ӡ����ǰѹ������̵ľ���ʵ�ְ�װ��
 * һϵ�е�ConcreteBuilder�У���Director�ṩһ��ͳһ�Ľӿڣ����Կ�����һ�����ģʽ��һ��СС�����֣���һ���ӿ�
 * ��װ�˹���Ҫ�õ��Ľӿڣ���builaPartA�ȡ�����������һ��Լ����Ҳ�������е�Builder�������̶�Ӧ�������Ƶġ�
 * 
 * @author maosuhan
 *
 */
public class Main {
public static void main(String args[]){
	Director director=new Director();
	Builder b1=new ConcreteBuilderA();
	Builder b2=new ConcreteBuilderB();
	
	director.construct(b1);
	Product p1=b1.getResult();
	p1.show();
	
	director.construct(b2);
	Product p2=b2.getResult();
	p2.show();
}
}
