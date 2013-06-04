package com.maosuhan.designpattern.composite;

import java.util.Iterator;
import java.util.Stack;


public class CompositeIterator implements Iterator<MenuComponent>{
  Stack<Iterator<MenuComponent>> stack=new Stack<Iterator<MenuComponent>>();
  
  public CompositeIterator(Iterator<MenuComponent> iterator){
	  stack.push(iterator);
  }
	@Override
	public boolean hasNext() {
		if (stack.isEmpty()){
			return false;
		}else{
			Iterator<MenuComponent> iterator=stack.peek();
			if (!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}
			else {
				return true;
			}
		}
	}

	@Override
	public MenuComponent next() {
		if (hasNext()){
			Iterator<MenuComponent> iterator=stack.peek();
			MenuComponent menuComponent=iterator.next();
			
			stack.push(menuComponent.createIterator());
			
			return menuComponent;
		}else {
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
