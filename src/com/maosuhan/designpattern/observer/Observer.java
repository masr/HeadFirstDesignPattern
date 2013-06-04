package com.maosuhan.designpattern.observer;

public interface Observer {
	
	//这里科学吗？如果参数在以后的情况中发生变化该怎么办呢？这是很有可能的。
public void update(float temp,float humidity,float pressure);
}
