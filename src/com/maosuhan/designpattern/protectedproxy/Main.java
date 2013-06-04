package com.maosuhan.designpattern.protectedproxy;

import java.lang.reflect.Proxy;

public class Main {
  public static void main(String args[]){
	  Main main=new Main();
	  main.go();
  }
  void go(){
	  PersonBean joe=new PersonBeanImpl();
	  PersonBean ownerProxy=this.getOwnerProxy(joe);
	  ownerProxy.setName("joe");
	  System.out.println("Name is "+ownerProxy.getName());
	  try{
	  ownerProxy.setHotOrNotRating(10);
	  }catch(Exception e){
		  System.out.println("Can't set rating from owner proxy");
	  }
	  PersonBean nonOwnerProxy=this.getNonOwnerProxy(joe);
	  nonOwnerProxy.setHotOrNotRating(3);
	  System.out.println("Joe's rating is "+nonOwnerProxy.getHotOrNotRating());
	  try{
		  nonOwnerProxy.setName("hh");
	  }catch(Exception e)
	  {
		  System.out.println("Can't set name from nonowner proxy");

	  }
	  }
  
  PersonBean getOwnerProxy(PersonBean person){
	  return (PersonBean)Proxy.newProxyInstance(
			  person.getClass().getClassLoader(),
			  person.getClass().getInterfaces(), 
			  new OwnerInvocationHandler(person));
  }
  PersonBean getNonOwnerProxy(PersonBean person){
	  return (PersonBean)Proxy.newProxyInstance(
			  person.getClass().getClassLoader(),
			  person.getClass().getInterfaces(), 
			  new NonOwnerInvocationHandler(person));
  }
}
