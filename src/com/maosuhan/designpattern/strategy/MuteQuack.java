package com.maosuhan.designpattern.strategy;

public class MuteQuack implements QuakeBehaviour{

	@Override
	public void quake() {
   System.out.println("<Silence>");		
	}

}
