package com.maosuhan.designpattern.composite;

import java.util.Iterator;

public class Waitress {
MenuComponent allMenus;

public Waitress(MenuComponent allMenus){
	this.allMenus=allMenus;
}

public void printMenu(){
	allMenus.printMenuComponent();
}

public void printMenuByIterator(){
	allMenus.printMe();
	Iterator<MenuComponent> iterator=new CompositeIterator(allMenus.createIterator());
	while(iterator.hasNext()){
		MenuComponent menuComponent=iterator.next();
		menuComponent.printMe();
	}
}


public void printVegetarianMenu(){
	Iterator<MenuComponent> iterator=new CompositeIterator(allMenus.createIterator());
	System.out.println("\nVEGETARIAN MENU\n---------------------");
	while(iterator.hasNext()){
		MenuComponent menuComponent=iterator.next();
		try{
		if (menuComponent.isVegetarian())
			menuComponent.printMe();
		}catch(UnsupportedOperationException e){}
	}
}
}
























