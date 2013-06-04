package com.maosuhan.designpattern.bridge;

public class Main {
  public static void main(String args[])
  {
	  HandsetBrand apple=new HandsetBrandApple();
	  
	  apple.setHandsetSoft(new HandsetGame());
	  apple.run();
	  
	  HandsetBrand nokia=new HandsetBrandNokia();
	  nokia.setHandsetSoft(new HandsetAddressList());
	  nokia.run();
  }
}
