package com.maosuhan.designpattern.flyweight;

public class CharFeature {
   private Color color;
   private char c;

   
   public int hashCode(){
	   return c+color.ordinal();
   }
   
   public boolean equals(Object f){
	   CharFeature feature=(CharFeature)f;
	   return  feature.c==c && feature.color.equals(color); 
	   
	   
   }
   
   
   public CharFeature(char c,Color color){
	     this.color=color;
	     this.c=c;
	   }
}
