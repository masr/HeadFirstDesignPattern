package com.maosuhan.designpattern.singleton;


public class Singleton {
	
	private static Singleton singleton;
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if (singleton==null)
		{
			Object object=new Object();
			synchronized (object) {
				if(singleton==null)
				{
					singleton=new Singleton();
				}
			}
		}
		return singleton;
	}

}
