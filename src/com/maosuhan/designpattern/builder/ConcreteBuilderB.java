package com.maosuhan.designpattern.builder;


public class ConcreteBuilderB extends Builder{

	private Product product=new Product();
	@Override
	void buildPartA() {
     product.add("����1");		
	}

	@Override
	void buildPartB() {
		product.add("����2");
		
	}

	@Override
	Product getResult() {
		return product;
	}

}
