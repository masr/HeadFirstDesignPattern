package com.maosuhan.designpattern.prototype;

public class Person implements Cloneable{
   private String name;
   private Person other;
  
   
   
   public Person(String name)
   {
	   this.name=name;
   }
   
   
   public Person(String name,String otherName){
     this.name=name;
     other=new Person(otherName); 
     this.other.other=this;
     
   }
   
  
   
   public String getName()
   {
	   return this.name;
   }
   
   public String getOtherName()
   {
	   return this.other.getName();
   }
   
   public Object clone()
   {
	   try {
		Person person=(Person) super.clone();
		person.other=new Person(this.other.name);
		person.other.other=person;
		return person;
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	
	return null;
   }
   
   public void setOtherName(String name)
   {
	   this.other.name=name;
   }
   
  
}
