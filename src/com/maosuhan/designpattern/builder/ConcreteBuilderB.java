package com.maosuhan.designpattern.builder;


public class ConcreteBuilderB extends Builder{

	private Product product=new Product();
	@Override
	void buildPartA() {
     product.add("部件1");		
	}

	@Override
	void buildPartB() {
		product.add("部件2");
		
	}

	@Override
	Product getResult() {
		return product;
	}

}
