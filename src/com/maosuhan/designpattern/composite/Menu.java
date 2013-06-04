package com.maosuhan.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	
	ArrayList<MenuComponent> menuComponents=new ArrayList<MenuComponent>();
	String name;
	String description;
	
	public Menu(String name,String description){
		this.name=name;
		this.description=description;
	}
	public void add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent){
		menuComponents.remove(menuComponent);
	}
	
	public MenuComponent  getChild(int i){
		return menuComponents.get(i);
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	
	
	public void printMenuComponent(){
		System.out.print("\n"+getName());
		System.out.println(", "+getDescription());
		System.out.println("-----------------------");
		Iterator<MenuComponent> iterator=menuComponents.iterator();
		while(iterator.hasNext()){
			MenuComponent menuComponent=iterator.next();
			menuComponent.printMenuComponent();
		}
	}
	
	public void printMe(){
		System.out.print("\n"+getName());
		System.out.println(", "+getDescription());
		System.out.println("-----------------------");
	}
	@Override
	public Iterator<MenuComponent> createIterator() {
		return menuComponents.iterator();
	}
	@Override
	public boolean isVegetarian() {
		return false;
	}

}
