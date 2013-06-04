package com.maosuhan.designpattern.composite;

import java.util.Iterator;

public abstract class MenuComponent {
   public void add(MenuComponent menuComponent){
	   throw new UnsupportedOperationException();
   }
   
   public void remove(MenuComponent menuComponent){
	   throw new UnsupportedOperationException();
   }
   
   public MenuComponent getChild(int i)
   {
	   throw new UnsupportedOperationException();
   }
   
   public String getName(){
	   throw new UnsupportedOperationException();
   }
   
   public String getDescription(){
	   throw new UnsupportedOperationException();
   }
   
   public abstract boolean isVegetarian();
   
   public void printMenuComponent(){
	   throw new UnsupportedOperationException();
   }
   
   public abstract void printMe();
   
   public abstract Iterator<MenuComponent> createIterator();
}



















