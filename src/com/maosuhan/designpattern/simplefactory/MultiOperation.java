package com.maosuhan.designpattern.simplefactory;

public class MultiOperation implements IOperation{

	@Override
	public double getResult(double a, double b) {
    return a*b;		
	}

}
