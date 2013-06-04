package com.maosuhan.designpattern.factorymethod;

public class UnderGraduateFactory implements LeiFengFactory{

	@Override
	public LeiFeng createLeiFeng() {
		return new UnderGraduate();
	}

}
