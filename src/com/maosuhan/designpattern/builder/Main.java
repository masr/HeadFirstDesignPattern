package com.maosuhan.designpattern.builder;
 
/**
 * 对外部而言，把一个完整对象的构建的过程屏蔽起来了，有时我们在构建一个完整的对象的时候，会new一个实例
 * 接着再调用一系列的该对象的方法，这样子暴露在外面的话可能看上去比较冗杂。于是把构建过程的具体实现包装在
 * 一系列的ConcreteBuilder中，而Director提供一个统一的接口，可以看作是一个外观模式的一个小小的体现，用一个接口
 * 包装了构建要用到的接口，如builaPartA等。但是这里有一个约束，也就是所有的Builder构建过程都应该是相似的。
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
