package com.maosuhan.designpattern.builder;


public class ConcreteBuilderA extends Builder{

	private Product product=new Product();
	@Override
	void buildPartA() {
     product.add("部件x");		
	}

	@Override
	void buildPartB() {
		product.add("部件y");
		
	}

	@Override
	Product getResult() {
		return product;
	}

}
