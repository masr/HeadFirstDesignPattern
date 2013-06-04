package com.maosuhan.designpattern.builder;


public class ConcreteBuilderA extends Builder{

	private Product product=new Product();
	@Override
	void buildPartA() {
     product.add("����x");		
	}

	@Override
	void buildPartB() {
		product.add("����y");
		
	}

	@Override
	Product getResult() {
		return product;
	}

}
