package com.maosuhan.designpattern.flyweight;

import java.util.Hashtable;



public class CharacterFactory {
	Hashtable<CharFeature, Char> chars;
	
	
	public CharacterFactory(){
		chars=new Hashtable<CharFeature,Char>();
	}
  public Char getCharacter(char c,Color color){
	  CharFeature feature=new CharFeature(c,color);
	  Char word=null;
	  if (!chars.containsKey(feature)){
		  word=new Word(c,color);
		  chars.put(feature, word);
	  }
	  else{
		  word= chars.get(feature);
	  }
	  return word;
	  
  }
}
