package com.maosuhan.designpattern.simplefactory;


public class DivOperation implements IOperation{

	@Override
	public double getResult(double a, double b) {
   		return a/b;
	}

}
