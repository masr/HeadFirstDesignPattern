package com.maosuhan.designpattern.observer;

public class Main {


	public static void main(String[] args) {
WeatherData weatherData=new WeatherData();
//这里实际上是因为双向依赖间接导致警告，看来这个不符合编程的规范和原则 啊
CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
weatherData.setMeasurements(80, 65, 30.4f);
	}

}
