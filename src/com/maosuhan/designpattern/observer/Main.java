package com.maosuhan.designpattern.observer;

public class Main {


	public static void main(String[] args) {
WeatherData weatherData=new WeatherData();
//����ʵ��������Ϊ˫��������ӵ��¾��棬������������ϱ�̵Ĺ淶��ԭ�� ��
CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
weatherData.setMeasurements(80, 65, 30.4f);
	}

}
