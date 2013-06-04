package com.maosuhan.designpattern.singleton;


public class Singleton2 {
  private static Singleton2 singleton2=new Singleton2();
  
  public static Singleton2 getInstance(){
	  return singleton2;
  }
}
