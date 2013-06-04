package com.maosuhan.designpattern.flyweight;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CharacterFactory factory=new CharacterFactory();
   String text="Hello everybody!!!";
   boolean isEnd=false;
   int index=0;
  
   while(!isEnd){
	   Color color=Color.red;
	   char c= text.charAt(index);
	   if (c=='o')
		   color=Color.yellow;
	   
	   Char word=factory.getCharacter(c, color);
	   word.print(0, index);
	   index++;
	   if (index==text.length())
		   isEnd=true;
   }
	}

}
