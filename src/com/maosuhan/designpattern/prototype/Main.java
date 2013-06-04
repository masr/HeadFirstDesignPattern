package com.maosuhan.designpattern.prototype;

public class Main {


	public static void main(String[] args) {
    Person person=new Person("msh","loo");
    Person person2=(Person) person.clone();
    System.out.println(person2.getName());
    System.out.println(person2.getOtherName());
    person.setOtherName("jm");
    System.out.println(person2.getOtherName());

	}

}
